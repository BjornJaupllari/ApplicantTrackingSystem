package com.example.ATS.controller;


import com.example.ATS.Service.ResumeService;
import com.example.ATS.dto.ResumeDto;
import com.example.ATS.entity.Resume;
import com.example.ATS.mapper.MapStructMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/vi/resume")
public class ResumeController {
    private final ResumeService resumeService;
    private final MapStructMapper mapStructMapper;

    @GetMapping
    private ResponseEntity<List<ResumeDto>> findAll() {
        return ResponseEntity.ok(mapStructMapper.toResumeDtos(resumeService.findAll()));
    }

    @PostMapping
    public ResponseEntity<ResumeDto> create(@RequestBody ResumeDto resumeDto){
        resumeService.save(mapStructMapper.resumeToEntity(resumeDto));
        return ResponseEntity.status(HttpStatus.CREATED).body(resumeDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResumeDto> findById(@PathVariable int id){
        Optional<Resume> resume = resumeService.findById(id);
        return ResponseEntity.ok(mapStructMapper.resumeToDto(resume.get()));
    }


    @PutMapping("/{id}")
    public ResponseEntity<ResumeDto> update(@PathVariable int id, @RequestBody ResumeDto resumeDto){
        Resume resume = mapStructMapper.resumeToEntity(resumeDto);
        resume.setId(id);

        resumeService.save(resume);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(resumeDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id){
        resumeService.deleteById(id);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

}
