package com.example.ATS.service;


import com.example.ATS.entity.User;
import com.example.ATS.repository.UserRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@NoArgsConstructor
@RequiredArgsConstructor
@Service
public class UserService {
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(int id) {
        return userRepository.findById(id);
    }

    public User save(User stock) {
        return userRepository.save(stock);
    }

    public void deleteById(int id) {
        userRepository.deleteById(id);
    }
}
