import java.util.HashSet;
import java.util.Set;

public class CookBook {
    private Set<Recipe> recipes = new HashSet<>();


    public void addRecipe(Recipe recipe){
        recipes.add(recipe);
    }

   public void printCookBook(){
       System.out.println("Рецепты :"+ recipes);


   }
}
