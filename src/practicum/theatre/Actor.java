package practicum.theatre;

import java.util.Objects;

public class Actor extends Person {
    private double height;

    public Actor(String name, String surname, double height, Gender gender) {
        super(name, surname, gender);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Актёр " + getName() + " " + getSurname() +
                " (Рост " + getHeight() + "м.).";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor other = (Actor) obj;
        return Objects.equals(this.getName(), other.getName()) &&
                Objects.equals(this.getSurname(), other.getSurname()) &&
                (this.getHeight() == other.getHeight());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname(), getHeight());
    }
}
