/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author micha
 */
import java.util.ArrayList;

public class RecipeBook {

    private ArrayList<Recipe> recipes;
    private RecipeBuilder rBuilder;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
        this.rBuilder = new RecipeBuilder(this.recipes);
    }

    public void createBook(ArrayList<String> fileAsArray) {
        this.rBuilder.createRecipes(fileAsArray);
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void listAll() {
        for (Recipe i : recipes) {
            System.out.println(i);
        }
        System.out.println("");
    }

    public void findByIngredient(String ingredient) {
        for (Recipe i : recipes) {
            if (i.getIngredients().contains(ingredient)) {
                System.out.println(i);
            }
        }
    }

    public void findByCookingTime(int time) {
        for (Recipe i : recipes) {
            if (i.getCookingTime() <= time) {
                System.out.println(i);
            }
        }
    }

    public void findRecipe(String name) {
        for (Recipe i : recipes) {
            String[] parts = i.getName().toLowerCase().split(" ");
            for (String s : parts) {
                if (s.contains(name)) {
                    System.out.println(i);
                }
            }
        }
    }
}
