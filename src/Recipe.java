import java.util.*;

public class Recipe {
    private Map<Product,Integer> products = new HashMap<>();
    private double totalCost;
    private String name;

    public Map<Product,Integer> getProducts() {
        return products;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getName() {
        return name;
    }

    public Recipe( String name) {
        if (products.containsKey(name)){
            throw new RuntimeException("Такой рецепт уже естьс");
        }else {

            this.name = name;
        }
    }


    public void addProduct(Product name , Integer value){
        if (value<=0){
            value=1;
            products.put(name, value);
        }else {
            products.put(name,value);
        }
        totalCost+= name.getCost()*value;
    }
    public void printRecipes(){
        System.out.println(getName()+" общая стоимость продуктов "+getTotalCost());
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Double.compare(recipe.totalCost, totalCost) == 0 && Objects.equals(products, recipe.products) && Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products, totalCost, name);
    }

    @Override
    public String toString() {
        return "Recipe{"  +
                ", totalCost=" + totalCost +
                ", name='" + name + '\'' +
                '}';
    }

}
