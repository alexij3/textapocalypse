package com.buzilov.textapocalypse.repository;

import com.buzilov.textapocalypse.model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
}
