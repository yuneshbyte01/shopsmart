package com.yuneshtimsina.shopsmart.controller;

import com.yuneshtimsina.shopsmart.dto.Authentication.AuthResponseDto;
import com.yuneshtimsina.shopsmart.dto.Authentication.UserLoginDto;
import com.yuneshtimsina.shopsmart.dto.Authentication.UserRegisterDto;
import com.yuneshtimsina.shopsmart.model.User;
import com.yuneshtimsina.shopsmart.repository.RoleRepository;
import com.yuneshtimsina.shopsmart.repository.UserRepository;
import com.yuneshtimsina.shopsmart.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public String register(@RequestBody UserRegisterDto dto) {
        if (userRepository.findByUsername(dto.getUsername()).isPresent()) {
            throw new RuntimeException("Username already exists");
        }

        User user = new User();
        user.setUsername(dto.getUsername());
        user.setEmail(dto.getEmail());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setRole(roleRepository.findByName("CUSTOMER").orElseThrow());
        userRepository.save(user);
        return "Registration successful";
    }

    @PostMapping("/login")
    public AuthResponseDto login(@RequestBody UserLoginDto dto) {
        User user = userRepository.findByUsername(dto.getUsername())
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!passwordEncoder.matches(dto.getPassword(), user.getPassword())) {
            throw new RuntimeException("Invalid credentials");
        }

        String token = jwtUtil.generateToken(user.getUsername());
        return new AuthResponseDto(token);
    }
}
