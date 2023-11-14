package com.jwt.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.controller.dto.LoginDto;
import com.jwt.controller.dto.Token;

import java.util.Calendar;
import java.util.Date;

@RestController
public class AuthController {

    private static final String SECRET_KEY = "this-secret-is-not-very-secret-99";

    @PostMapping("/auth")
    public ResponseEntity<Token> auth(@RequestBody LoginDto loginDto) {
        if (isValidUser(loginDto)) {
            // If the user is valid, generate a JWT token
            String token = generateToken(loginDto.getUsername());
            Token responseToken = new Token(token);
            
            // Return a ResponseEntity with the token and HTTP status OK
            return ResponseEntity.ok(responseToken);
        } else {
            // If the user is not valid, return a ResponseEntity with HTTP status UNAUTHORIZED
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(null); // or return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }


    private boolean isValidUser(LoginDto loginDto) {
        // Add your logic to check if the provided credentials are valid
        return loginDto.getUsername().equals("user@mail.com") && loginDto.getPassword().equals("password");
    }

    private String generateToken(String email) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR, 10);

        return Jwts.builder()
                .setSubject(email)
                .claim("role", "user")
                .setIssuedAt(new Date())
                .setExpiration(calendar.getTime())
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
}

