/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pc
 */
public class SessionManager {
     private static Employee loggedInEmployee;

    public static void setLoggedInEmployee(Employee employee) {
        loggedInEmployee = employee;
    }

    public static Employee getLoggedInEmployee() {
        return loggedInEmployee;
    }

    public static void clearSession() {
        loggedInEmployee = null;
    }
}
