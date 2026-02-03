package com.foodlie.demo.security;

import com.foodlie.demo.auth_users.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;

@Service
@Slf4j
public class JwtUtils {

    private static final long EXPIRATION_TIME = 30L * 24 * 60 * 1000;
    private SecretKey key;

    private String secreteJwtString;


}
