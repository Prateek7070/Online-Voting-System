// Admin.java (optional for future database-backed login)
package com.example.voting.model;

public class Admin {
    private final String username = "admin";
    private final String password = "password";

    public boolean isValid(String inputUser, String inputPass) {
        return username.equals(inputUser) && password.equals(inputPass);
    }
}
