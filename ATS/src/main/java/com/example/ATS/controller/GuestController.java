package com.example.ATS.controller;


import com.example.ATS.dto.GuestDto;
import com.example.ATS.entity.Guest;
import com.example.ATS.mapper.MapStructMapper;
import com.example.ATS.service.GuestServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/guest")

public class GuestController {
    private GuestServices guestServices;
    private MapStructMapper mapStructMapper;

    @Autowired
    public GuestController(GuestServices guestServices) {
        this.guestServices = guestServices;
    }

    @GetMapping
    public ResponseEntity<List<GuestDto>> findall() {
        return ResponseEntity.ok(mapStructMapper.toGuestDtos(guestServices.getAll()));
    }

    @PostMapping
    public ResponseEntity<GuestDto> create(@RequestBody GuestDto guestDto) {
        guestServices.save(mapStructMapper.guestToEntity(guestDto));

        return ResponseEntity.status(HttpStatus.CREATED).body(guestDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GuestDto> findById(@PathVariable int id) {
        Optional<Guest> guest = guestServices.findById(id);

        return ResponseEntity.ok(mapStructMapper.guestToDto(guest.get()));
    }

    @PutMapping("/{id}")
    public ResponseEntity<GuestDto> update( @RequestBody GuestDto guestDto) {
        Guest guest = mapStructMapper.guestToEntity(guestDto);

        guestServices.save(guest);

        return ResponseEntity.status(HttpStatus.ACCEPTED).body(guestDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        guestServices.deleteById(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }
}
