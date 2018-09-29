/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import domain.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 669385
 */
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("logout") == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ((((username == null) || (username.equals(""))) || ((password == null) || (password.equals(""))))) {
            request.setAttribute("error", "Invalid Username or Password.");
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            return;
        }
        
        UserService us = new UserService();
        User u = us.login(username, password);
        
        if(u != null){
            HttpSession hs = request.getSession();
            hs.setAttribute("username", u.getUsername());
            if (request.getParameter("remember") != null){
                Cookie c = new Cookie("username", u.getUsername());
                c.setMaxAge(60*60*24*30);
                c.setPath("/");
            }
        }
    }
}
