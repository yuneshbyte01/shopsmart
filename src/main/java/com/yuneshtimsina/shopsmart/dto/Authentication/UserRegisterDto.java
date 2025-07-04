package com.yuneshtimsina.shopsmart.dto.Authentication;

import lombok.Data;

@Data
public class UserRegisterDto {
    private String username;
    private String email;
    private String password;
}
