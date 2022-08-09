package com.raiseup.recipeApp.controller;

import com.raiseup.recipeApp.model.Recipe;
import com.raiseup.recipeApp.repository.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IndexController {
    private final RecipeRepository recipeRepository;

    public IndexController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping({"","/","index","index.html"})
    public String getIndexPage(Model model){
        model.addAttribute("recipes",(List<Recipe>)recipeRepository.findAll());
        return "index";
    }
}
