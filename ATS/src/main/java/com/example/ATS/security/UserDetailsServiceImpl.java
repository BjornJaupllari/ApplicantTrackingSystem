package com.example.ATS.security;

import com.example.ATS.entity.User;
import com.example.ATS.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service(value = "userDetailService")
public class UserDetailsServiceImpl implements UserDetailsService {

    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        User userEntity = userRepository.findUserByUsername(username);
        if (userEntity == null) {
            throw new RuntimeException("User not found");
        }
        return UserPrincipal.build(userEntity);
    }


}