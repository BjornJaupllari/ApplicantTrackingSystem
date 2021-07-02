package com.example.ATS.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResumeDto {

    private int id;
    private byte resume;
    private String skills;
    private String address;
    private String stateProvince;
    private String education;
    private String experience;

}
