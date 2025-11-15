package com.buzilov.textapocalypse.repository;

import com.buzilov.textapocalypse.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
