package com.bsi.walled_api.dto;

import lombok.Data;

@Data
public class UserResponse {
    private String email;
    private String username;
    private String fullname;
    private String password;
    private String avatarUrl;
    private String phoneNumber;
}
