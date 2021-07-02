package com.example.ATS.dto;

import com.example.ATS.entity.Employee;
import com.example.ATS.entity.Interview;
import com.example.ATS.entity.Post;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CompanyDto {

    private int id;
    private String name;
    private String address;
    private String phoneNumber;
    private String website;
    private byte [] logo;
    private String email;
    private String password;
    private Post post;
    private Employee employee;
    private Interview interview;

}
