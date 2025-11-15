package com.buzilov.textapocalypse.repository;

import com.buzilov.textapocalypse.model.PlayableCharacter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends CrudRepository<PlayableCharacter, Long> {
}
