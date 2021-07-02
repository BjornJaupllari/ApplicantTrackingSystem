package com.example.ATS.dto;

import com.example.ATS.entity.Applicant;
import com.example.ATS.entity.Company;
import com.example.ATS.entity.Post;
import com.example.ATS.entity.Status;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class InterviewDto {

    private int id;
    private Date date;
    private long duration;
    private String description;
    private Company company;
    private Post posts;
    private Status status;
    private Applicant applicants;

}
