import java.util.HashSet;
import java.util.Set;

public class Table {
    public void addTable() {
        Set<String> table = new HashSet<>();
        int min = 2;
        int max = 9;
        for (int i = 0; i <= 15; i++) {
            if (table.size() != 15) {
                table.add(((int) ((Math.random() * ((max - min) + 1)) + min)) + "*" + ((int) ((Math.random() * ((max - min) + 1)) + min)));
            }
        }
        System.out.println(table);
    }
}
