import java.util.HashMap;
import java.util.Map;

public class Passport {
    private int number;
    private String name;
    private String surname;
    private String patronymic;
    private String date;

    public Passport(int number, String name, String surname, String patronymic, String date) {
        this.number = number;
        if (name == null || name.isBlank()) {
            this.name = "Поле должно быть заполнено";
        } else {
            this.name = name;
        }
        if (surname == null || surname.isBlank()) {
            this.surname = "Поле должно быть заполнено";
        } else {
            this.surname = surname;
        }
            this.patronymic = patronymic;
        if (date == null || date.isBlank()) {
            this.date = "Поле должно быть заполнено ";
        } else {
            this.date = date;

        }
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getDate() {
        return date;
    }



}
