import java.util.HashMap;
import java.util.Map;

public class PassportBase {
    private Map<Integer,Passport> base = new HashMap<>();
    public void addPassport(Passport passport){
        base.put(passport.getNumber(), passport);
    }
    public void dataBaseSearch(Integer number){
        if (base.containsKey(number)==true){
            System.out.println(base.get(number));
        }else {
            System.out.println("В базе не обнаруженно");
        }
    }

    @Override
    public String toString() {
        return "PassportBase{" +
                "base=" + base +
                '}';
    }
}
