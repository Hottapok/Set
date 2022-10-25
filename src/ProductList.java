import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ProductList {
    private Set<Product> spisok;

    public ProductList(Set<Product> spisok) {
        this.spisok = spisok;
    }

    public Set getSpisok() {
        return spisok;
    }

    public void addSpisok(Product product) {
        if (!spisok.contains(product)) {
            spisok.add(product);
        } else if (product.equals(spisok)) {
            throw new RuntimeException("Продукт уже в сумке");
        }

    }

    public void delProduct(Product product) {
        spisok.remove(product);
    }

    public void buyProduct(Product product) {
        if (spisok.contains(product)) {
            ArrayList<String> prod= new ArrayList<>();
            prod.add(product+" Куплен");
            System.out.println(prod);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductList list = (ProductList) o;
        return Objects.equals(spisok, list.spisok);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spisok);
    }

    @Override
    public String toString() {
        return "Список продуктов : " + spisok;
    }
}
