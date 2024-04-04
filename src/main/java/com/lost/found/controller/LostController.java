package com.lost.found.controller;

import com.lost.found.entity.Lost;
import com.lost.found.service.LostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lost")
public class LostController {
    private final LostService lostService;

    public LostController(LostService lostService) {
        this.lostService = lostService;
    }

    @PostMapping
    public ResponseEntity<?> postNewItem(@RequestBody Lost lost){
        return lostService.postItem(lost);
    }

}
