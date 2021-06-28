package com.example.ATS.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "role")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Applicant implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="guest_id")

    @Column(name="user_id")

    @Column(name="cv_id")

    @Column(name="comment")
    private String comment;

}
