package com.raiseup.recipeApp.repository;

import com.raiseup.recipeApp.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
    Optional<UnitOfMeasure>findByDescription(String description);
}
