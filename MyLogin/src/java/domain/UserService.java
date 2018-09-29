/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import domain.*;

/**
 *
 * @author 669385
 */
public class UserService {

    String username, password;

    public User login(String username, String password) {
        if ((username.equals("adam") && password.equals("password")) || (username.equals("betty") && password.equals("password"))) { 
        }
        password = null;
        User u = new User(username, password);
        return u;
    }
}
