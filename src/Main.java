import java.util.*;

public class Main {
    public static void main(String[] args) {
        Product tomato = new Product("Помидор", 10.5, 1.2);
        Product cucumber = new Product("Помидор", 10.5, 2);
        Product corn = new Product("Кукуруза", 14.7, 0.7);
        Product peas = new Product("Горох", 4, 0.95);
        Set<Product> spisok = new HashSet<>();

        ProductList list = new ProductList(spisok);
        list.addSpisok(tomato);
        list.addSpisok(cucumber);
        list.addSpisok(corn);
        list.addSpisok(peas);
        System.out.println(list.toString());

        Recipe bliny = new Recipe(spisok, 120, "Блинчики");

        Set<Recipe> cookBook = new HashSet<>();
        cookBook.add(bliny);


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
        Map<Integer,String> dataBase = new HashMap<>();
        passport1.addPassport(dataBase);
        passport2.addPassport(dataBase);
        passport3.addPassport(dataBase);

        System.out.println(dataBase);

    }

}