package com.buzilov.textapocalypse.controller;

import com.buzilov.textapocalypse.model.PlayableCharacter;
import com.buzilov.textapocalypse.repository.CharacterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/characters")
@RequiredArgsConstructor
public class PlayableCharacterController {

    private final CharacterRepository characterRepository;

    @PostMapping
    public ResponseEntity<PlayableCharacter> createCharacter(@RequestBody PlayableCharacter character) {
        return ResponseEntity.ok(characterRepository.save(character));
    }

    @PutMapping("/{id}/move/{locationId}")
    public ResponseEntity<Void> moveCharacter(@PathVariable Long characterId,
                                              @PathVariable Long locationId) {
        return ResponseEntity.ok()
                .build();
    }

}
