package com.printway.config;

import java.io.Serializable;

public class Database implements Serializable {
    private final String url = "jdbc:mysql://1.1.1.1/name";
    private final String username = "username";
    private final String password = "password";

    public Database() {
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
