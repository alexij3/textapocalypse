package com.buzilov.textapocalypse.controller;

import com.buzilov.textapocalypse.model.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @PostMapping
    public ResponseEntity<Void> createPlayer(@RequestBody Player player) {
        return ResponseEntity.ok()
                .build();
    }

}
