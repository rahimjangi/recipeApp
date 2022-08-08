package com.raiseup.recipeApp.repository;

import com.raiseup.recipeApp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
