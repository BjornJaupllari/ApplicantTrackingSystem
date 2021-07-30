package com.example.ATS.service;

import com.example.ATS.entity.Resume;
import com.example.ATS.repository.ResumeRepository;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@NoArgsConstructor
@RequiredArgsConstructor
@Service
public class ResumeService {
    private  ResumeRepository resumeRepository;

    public List<Resume> findAll() {
        return resumeRepository.findAll();
    }

    public Optional<Resume> findById(int id) {
        return resumeRepository.findById(id);
    }

    public Resume save(Resume stock) {
        return resumeRepository.save(stock);
    }

    public void deleteById(int id) {
        resumeRepository.deleteById(id);
    }

}
