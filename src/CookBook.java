import java.util.HashSet;
import java.util.Set;

public class CookBook {
    private Set<Recipe> recipes = new HashSet<>();


    public void addRecipe(Recipe recipe){
        if (recipes.contains(recipe)){
            throw new RuntimeException("Такой рецепт уже есть!");
        }else {
            recipes.add(recipe);
        }
    }

   public void printCookBook(){
       System.out.println("Рецепты :"+ recipes);


   }
}
