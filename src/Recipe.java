import java.util.Objects;
import java.util.Set;

public class Recipe {
    private Set<Product> products;
    private double totalCost;
    private String name;

    public Set<Product> getProducts() {
        return products;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getName() {
        return name;
    }

    public Recipe(Set<Product> products, double totalCost, String name) {
        this.products = products;
        this.totalCost = totalCost;
        this.name = name;
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
        return "Recipe{" +
                "products=" + products +
                ", totalCost=" + totalCost +
                ", name='" + name + '\'' +
                '}';
    }

}
