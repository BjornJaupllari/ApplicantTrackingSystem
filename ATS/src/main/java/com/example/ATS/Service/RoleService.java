package com.example.ATS.service;


import com.example.ATS.entity.Role;
import com.example.ATS.repository.RoleRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@NoArgsConstructor
@RequiredArgsConstructor
@Service
public class RoleService {

    private RoleRepository roleRepository;

    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    public Optional<Role> findById(int id) {
        return roleRepository.findById(id);
    }

    public Role save(Role stock) {
        return roleRepository.save(stock);
    }

    public void deleteById(int id) {
        roleRepository.deleteById(id);
    }

}
