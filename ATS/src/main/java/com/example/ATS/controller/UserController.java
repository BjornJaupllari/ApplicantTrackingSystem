package com.example.ATS.controller;


import com.example.ATS.service.UserService;
import com.example.ATS.dto.UserDto;
import com.example.ATS.entity.User;
import com.example.ATS.mapper.MapStructMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/vi/user")
public class UserController {
    private final UserService userService;
    private final MapStructMapper mapStructMapper;

    @GetMapping
    private ResponseEntity<List<UserDto>> findAll() {
        return ResponseEntity.ok(mapStructMapper.toUserDtos(userService.findAll()));
    }

    @PostMapping
    public ResponseEntity<UserDto> create(@RequestBody UserDto userDto) {
        userService.save((mapStructMapper.userToEntity(userDto)));
        return ResponseEntity.status(HttpStatus.CREATED).body(userDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> findById(@PathVariable int id) {
        Optional<User> user = userService.findById(id);
        return ResponseEntity.ok(mapStructMapper.userToDto(user.get()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserDto> update(@PathVariable int id, @RequestBody UserDto userDto) {
        User user = mapStructMapper.userToEntity(userDto);
        user.setId(id);

        userService.save(user);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(userDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        userService.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }


}
