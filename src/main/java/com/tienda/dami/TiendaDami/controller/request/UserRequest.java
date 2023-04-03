package com.tienda.dami.TiendaDami.controller.request;

import jakarta.validation.constraints.NotBlank;

public class UserRequest {


    @NotBlank
    private String userName;

    @NotBlank
    private String password;

    public UserRequest(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
