package com.example.ATS.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "resume")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Resume implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Lob
    @Column(name = "resume")
    private byte[] resume;

    @Column(name = "skills")
    private String skills;

    @Column(name = "address")
    private String address;

    @Column(name = "stete_province")
    private String stateProvince;

    @Column(name = "education")
    private String education;

    @Column(name = "experience")
    private String experience;

}
