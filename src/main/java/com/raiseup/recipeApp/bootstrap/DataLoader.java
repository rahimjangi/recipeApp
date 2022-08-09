package com.raiseup.recipeApp.bootstrap;

import com.raiseup.recipeApp.model.Category;
import com.raiseup.recipeApp.model.Difficulty;
import com.raiseup.recipeApp.model.Ingredient;
import com.raiseup.recipeApp.model.Recipe;
import com.raiseup.recipeApp.repository.CategoryRepository;
import com.raiseup.recipeApp.repository.RecipeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {
    private final RecipeRepository recipeRepository;
    private final CategoryRepository categoryRepository;

    public DataLoader(RecipeRepository recipeRepository, CategoryRepository categoryRepository) {
        this.recipeRepository = recipeRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if(recipeRepository.count()==0){

            loadData();
        }

    }

    private void loadData() {
        Recipe recipe1= new Recipe();
        recipe1.setDescription("Recipe 1 description");
        recipe1.setCookTime(60);
        recipe1.setServings(4);
        recipe1.setPrepTime(10);
        recipe1.setUrl("http://www.recipe1.com");
        recipe1.setSource("Source for recipe1");
        Iterable<Category> categories = categoryRepository.findAll();
        recipe1.setCategories((List<Category>) categories);
        recipe1.setDifficulty(Difficulty.EASY);
        recipe1.setDirections("Nothing much to do!");
        Ingredient ingredient1= new Ingredient();
        ingredient1.setDescription("Ingredient1 for recipe1");
        Ingredient ingredient2= new Ingredient();
        ingredient2.setDescription("Ingredient2 for recipe1");
        List<Ingredient> ingredients=  List.of(ingredient1,ingredient2);
        recipe1.setIngredients(ingredients);
        recipeRepository.save(recipe1);
    }
}
