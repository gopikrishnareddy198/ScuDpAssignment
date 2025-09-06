package com.example.controller;

import com.example.entity.JwtResponse;
import com.example.entity.SigninRequest;
import com.example.entity.SignupRequest;
import com.example.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody SignupRequest request) {
        authService.signup(request);
        return ResponseEntity.ok("User registered");
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtResponse> signin(@RequestBody SigninRequest request) {
        return ResponseEntity.ok(authService.signin(request));
    }

       @PostMapping("/signin")
    public ResponseEntity<JwtResponse> signin1(@RequestBody SigninRequest request) {
        return ResponseEntity.ok(authService.signin(request));
    }
}
