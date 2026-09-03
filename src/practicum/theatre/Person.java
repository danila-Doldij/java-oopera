package practicum.theatre;

public class Person {

    private String name;
    private String surname;
    private double height;
    private Gender gender;

    public Person(String name, String surname, double height, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
