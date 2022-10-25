import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product tomato = new Product("Помидор", 10.5);
        Product cucumber = new Product("Огурец", 10.5);
        Product corn = new Product("Кукуруза", 14.7);
        Product peas = new Product("Горох", 4);
        Set<Product> spisok = new HashSet<>();

        ProductList list = new ProductList(spisok);
        list.addSpisok(tomato);
        list.addSpisok(cucumber);
        list.addSpisok(corn);
        list.addSpisok(peas);
        list.delProduct(corn);
        System.out.println(list.toString());
        list.buyProduct(corn);
        list.buyProduct(tomato);

        Recipe pirog = new Recipe("Пирог с рыбой");
        Recipe pirog1 = new Recipe("Пирог с капустой");
        Recipe pirog2 = new Recipe("Пирог с мясом");

        pirog.addProduct(new Product("Тесто",120.0),2);
        pirog.addProduct(new Product("Рыба",350),1);
        pirog.addProduct(new Product("Лук",25),1);
        pirog.printRecipes();
        CookBook cookBook=new CookBook();
        cookBook.addRecipe(pirog1);
        cookBook.addRecipe(pirog2);
        cookBook.addRecipe(pirog);
        cookBook.printCookBook();




        Set<Integer> set = new HashSet<>();
        int min = 0;
        int max = 1000;
        int number =0;
        for (int i = 0; i < 20; i++) {
            number = (int) ((Math.random()*((max-min)+1))+min);
            set.add(number);
        }
        System.out.println(set);
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()) {
            Integer setElement = iterator.next();
            if(setElement%2==0) {
                iterator.remove();
            }
        }
        System.out.println(set);

        Table table= new Table();
        table.addTable();

        Passport passport1 =  new Passport(125,"Andrei","Ivanovich","Golovach","10.10.1990");
        Passport passport2 = new Passport(124,"Nikolai","Andreeevich","","14.1.1989");
        Passport passport3 = new Passport(123,"Andrei","Andreevich","Petrov","10.10.1990");

        PassportBase base= new PassportBase();
        base.addPassport(passport1);
        base.addPassport(passport2);
        base.addPassport(passport3);

        System.out.println(base);
        base.dataBaseSearch(127);
    }

}