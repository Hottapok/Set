import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {
    private String name;
    private double cost;
    private double weight;

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost == 0) {
            System.out.println("Заполните карточку товара полностью");
        } else {

            this.cost = cost;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight == 0) {
            System.out.println("Заполните карточку товара полностью");
        } else {

        }
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null|| name.isBlank()){
            System.out.println("Заполните карточку товара полностью");
        }else {

            this.name = name;
        }
    }

    public Product(String name, double cost) {
        setName(name);
        setCost(cost);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
