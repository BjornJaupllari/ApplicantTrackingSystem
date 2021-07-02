package com.example.ATS.dto;

import com.example.ATS.entity.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {

    private int id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private char gender;
    private Role roles;

}
