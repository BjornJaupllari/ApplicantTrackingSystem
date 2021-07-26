package com.example.ATS.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ResumeDto {

    private int id;
    private byte resume;
    private String skills;
    private String address;
    private String stateProvince;
    private String education;
    private String experience;

}
