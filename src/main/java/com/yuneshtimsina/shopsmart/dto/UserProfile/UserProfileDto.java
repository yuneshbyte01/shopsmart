package com.yuneshtimsina.shopsmart.dto.UserProfile;

import lombok.Data;

@Data
public class UserProfileDto {
    private Long id;
    private String username;
    private String email;
    private String role;
}