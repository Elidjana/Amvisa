package com.foodlie.demo.security;

import com.foodlie.demo.auth_users.entity.User;
import com.foodlie.demo.auth_users.repository.UserRepository;
import com.foodlie.demo.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @SneakyThrows
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

       User user = (User) userRepository.findByEmail(username)
               .orElseThrow(()-> new NotFoundException("User not found!"));

       return AuthUser.builder()
               .user(user)
               .build();

    }

}
