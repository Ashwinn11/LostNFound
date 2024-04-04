package com.lost.found.service;

import com.lost.found.entity.Lost;
import com.lost.found.repository.LostRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LostService {
    private final LostRepository lostRepository;

    public LostService(LostRepository lostRepository) {
        this.lostRepository = lostRepository;
    }

    public ResponseEntity<?> postItem(Lost lost) {
         lostRepository.save(lost);
         return ResponseEntity.status(200).body("Data is saved");
    }
}
