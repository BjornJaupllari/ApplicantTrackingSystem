package com.example.ATS.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "post")

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;

    @Column(name = "contact")
    private Contact contact;

    @Column(name = "job_title")
    private String jobtitle;

    @Column(name = "expiration_date")
    private ExpirationDate expirationDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id")
    private Type type;


    @Column(name = "work_experience")
    private WorkExperience workExperience;

    @Column(name = "departament")
    private String departament;

//    @Column(name = "attachment")
//    private String attachment;

    @Column(name = "description")
    private String description;

    @Column(name = "location")
    private String location;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "company_id")
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "interview_id")
    private Interview interview;


    public Post() {
    }
}
