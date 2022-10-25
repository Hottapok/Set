import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Table {
    public void addTable() {
        int min = 2;
        int max = 9;
        int size = 15;
        Set<String> set = new HashSet<>();
        while (set.size() < size + 1) {
            int first = ThreadLocalRandom.current().nextInt(min, max + 1);
            int second = ThreadLocalRandom.current().nextInt(min, max + 1);
            if (!set.contains(first + "*" + second) && (!set.contains(second + "*" + first))) {
                set.add(first + "*" + second);
            }
        }
        System.out.println(set);
    }
}
