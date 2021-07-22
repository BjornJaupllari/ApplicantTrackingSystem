package com.example.ATS.service;

import com.example.ATS.entity.Applicant;
import com.example.ATS.entity.Guest;
import com.example.ATS.repository.ApplicantRepository;
import com.example.ATS.repository.GuestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GuestServices {
    @Autowired
    private final GuestRepository guestRepository;


    // getall
    public List<Guest> getAll(){
        return guestRepository.findAll();
    }
    //GetCompByd

    public Optional<Guest> findById(int id){
        return guestRepository.findById(id);
    }
    //save
    public Guest save(@RequestBody Guest guest){
        return guestRepository.save(guest);
    }
    //delete
    public void deleteById(int id){
        guestRepository.deleteById(id);
    }
}
