package com.example.ATS.service;


import com.example.ATS.entity.Applicant;
import com.example.ATS.repository.ApplicantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ApplicantServices {
    @Autowired
    private final ApplicantRepository applicantRepository;


    // getall
    public List<Applicant> getAll() {
        return applicantRepository.findAll();
    }
    //GetCompByd

    public Optional<Applicant> findById(int id) {
        return applicantRepository.findById(id);
    }

    //save
    public Applicant save(@RequestBody Applicant applicant) {
        return applicantRepository.save(applicant);
    }

    //delete
    public void deleteById(int id) {
        applicantRepository.deleteById(id);
    }
}
