package practicum.theatre;

public class Director extends Person {
    private int numberOfShows;

    public Director(String name, String surname, double height, Gender gender, int numberOfShows) {
        super(name, surname, height, gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    @Override
    public String toString() {
        return "Режиссёр спектакля: " + getName() + " " + getSurname() + ".";
    }
}
