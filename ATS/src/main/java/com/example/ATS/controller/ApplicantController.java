package com.example.ATS.controller;

import com.example.ATS.dto.ApplicantDto;
import com.example.ATS.entity.Applicant;
import com.example.ATS.mapper.MapStructMapper;
import com.example.ATS.service.ApplicantServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/applicant")
public class ApplicantController {

    @Autowired
    private final ApplicantServices applicantServices;
    private final MapStructMapper mapStructMapper;

    @GetMapping
    public ResponseEntity<List<ApplicantDto>> findall() {
        return ResponseEntity.ok(mapStructMapper.toApplicantDtos(applicantServices.getAll()));
    }

    @PostMapping
    public ResponseEntity<ApplicantDto> create(@RequestBody ApplicantDto applicantDto) {
        applicantServices.save(mapStructMapper.applicantToEntity(applicantDto));

        return ResponseEntity.status(HttpStatus.CREATED).body(applicantDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApplicantDto> findById(@PathVariable int id) {
        Optional<Applicant> applicant = applicantServices.findById(id);

        return ResponseEntity.ok(mapStructMapper.applicantToDto(applicant.get()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApplicantDto> update(@PathVariable int id, @RequestBody ApplicantDto applicantDto) {
        Applicant applicant = mapStructMapper.applicantToEntity(applicantDto);
        applicant.setId(id);

        applicantServices.save(applicant);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(applicantDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        applicantServices.deleteById(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
