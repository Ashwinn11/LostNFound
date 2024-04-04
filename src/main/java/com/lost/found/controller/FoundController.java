package com.lost.found.controller;

import com.lost.found.entity.Found;
import com.lost.found.service.FoundService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/found")
public class FoundController {
    private final FoundService foundService;

    public FoundController(FoundService foundService) {
        this.foundService = foundService;
    }

    @PostMapping
    public ResponseEntity<?> postNewItem(@RequestBody Found found){
        return foundService.postItem(found);
    }

}
