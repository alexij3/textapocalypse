package com.buzilov.textapocalypse.controller;

import com.buzilov.textapocalypse.model.Location;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/locations")
public class LocationController {

    @GetMapping("/{id}")
    public ResponseEntity<Location> getLocation(@PathVariable String id) {
        return ResponseEntity.ok()
                .build();
    }

}
