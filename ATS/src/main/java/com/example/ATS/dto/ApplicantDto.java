package com.example.ATS.dto;

import lombok.Data;
import lombok.NonNull;

@Data
public class ApplicantDto {

    private int id;
    private int comment;
    private int guest;
    private int user;

    @NonNull
    private int resume;

}
