package lab12_mirea;
public class Person {
    private String surname;
    private String name;
    private String patronymic;
    public Person(String surname, String name, String patronymic) {
        if (surname == null || surname.trim().isEmpty()) {throw new IllegalArgumentException("Укажите фамилию");}
        this.surname = surname.trim();
        this.name = "";
        this.patronymic = "";
        if (name != null) {
            this.name = name.trim();
        }
        if (patronymic != null) {
            this.patronymic = patronymic.trim();
        }
    }
    public String getShortName() {
        StringBuilder result = new StringBuilder(surname);
        if (!name.isEmpty() || !patronymic.isEmpty()) {
            result.append(' ');
        }
        if (!name.isEmpty()) {
            result.append(name.charAt(0)).append('.');
        }
        if (!patronymic.isEmpty()) {
            result.append(patronymic.charAt(0)).append('.');
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Person[] people = {new Person("Петров", "Иван", "Петрович"),
                new Person("Петров", "Иван", null),
                new Person("Петров", null, "Петрович"),
                new Person("Петров", "", "")
        };
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getShortName());
        }
    }
}
