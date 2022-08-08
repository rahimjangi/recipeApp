package com.raiseup.recipeApp.model;

<<<<<<< HEAD
public enum Difficulty  {
   EASY,MODERATE,HARD;

=======
import javax.persistence.*;

@Entity
public class Difficulty  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    @JoinColumn(name = "recipe_id")
    private Recipe recipe;

    public Recipe getRecipe() {
        return recipe;
    }
>>>>>>> origin/main
}
