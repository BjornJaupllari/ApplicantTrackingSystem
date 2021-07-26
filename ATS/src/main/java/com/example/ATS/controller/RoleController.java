package com.example.ATS.controller;

import com.example.ATS.Service.RoleService;
import com.example.ATS.dto.RoleDto;
import com.example.ATS.entity.Role;
import com.example.ATS.mapper.MapStructMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/vi/role")
public class RoleController {

    private final RoleService roleService;
    private final MapStructMapper mapStructMapper;

    @GetMapping
    private ResponseEntity<List<RoleDto>> findAll() {
        return ResponseEntity.ok(mapStructMapper.toRoleDtos(roleService.findAll()));
    }

    @PostMapping
    public ResponseEntity<RoleDto> create(@RequestBody RoleDto roleDto) {
        roleService.save(mapStructMapper.roleToEntity(roleDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(roleDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoleDto> findById(@PathVariable int id) {
        Optional<Role> role = roleService.findById(id);
        return ResponseEntity.ok(mapStructMapper.roleToDto(role.get()));
    }


    @PutMapping("/{id}")
    public ResponseEntity<RoleDto> update(@PathVariable int id, @RequestBody RoleDto roleDto) {
        Role role = mapStructMapper.roleToEntity(roleDto);
        role.setId(id);

        roleService.save(role);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(roleDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        roleService.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

}
