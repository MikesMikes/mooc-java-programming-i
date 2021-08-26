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
import java.util.Scanner;

public class RecipeBuilder {
    private ArrayList<Recipe> recipes;
    
    public RecipeBuilder(ArrayList<Recipe> recipes){
        this.recipes = recipes;
    }
    
    public void createRecipes(ArrayList<String> fileAsArray){
        ArrayList<String> oneRecipe = new ArrayList<>();
        int index = 1;
        for(String i : fileAsArray){
            if(!i.equals("")){
                oneRecipe.add(i);
            }
            if(i.equals("") || index == fileAsArray.size()){
                this.addRecipe(oneRecipe);
                oneRecipe.clear();
            }
            index++;
        }
    }
    
    private void addRecipe(ArrayList<String> recipe){
        String name = recipe.get(0);
        int cookingTime = Integer.valueOf(recipe.get(1));
        ArrayList<String> ingredients = createIngredients(recipe);
        Recipe newRecipe = new Recipe(name, cookingTime, ingredients);
        this.recipes.add(newRecipe);
    }
    
    private ArrayList<String> createIngredients(ArrayList<String> recipe){
        ArrayList<String> ingredients = new ArrayList<>(recipe);
        ingredients.remove(0);
        ingredients.remove(0);
        return ingredients;
    }
}
