package practicum.theatre;

import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>(listOfActors);
    }

    public Director getDirector() {
        return director;
    }

    public int getDuration() {
        return duration;
    }

    public ArrayList<Actor> getListOfActors() {
        return new ArrayList<>(listOfActors);
    }

    public String getTitle() {
        return title;
    }

    public void printListOfActors() {
        System.out.println("Список актёров спектакля '" + title + "'");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void addActor(Actor actor) {
        if (listOfActors.contains(actor)) {
            System.out.println("Актёр " + actor.getName() + " " + actor.getSurname() +
                    "уже участвует в спектакле '" + title + "'");
            return;
        }

        listOfActors.add(actor);
        System.out.println("Актёр " + actor.getName() + " " + actor.getSurname() +
                " успешно добавлен в спектакль '" + title + "'");
        System.out.println();
    }

    public void replaceTheActor(Actor newActor, String surnameToReplace) {
        int indexToReplace = -1;

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if (currentActor.getSurname().equals(surnameToReplace)) {
                indexToReplace = i;
                break;
            }
        }

        if (indexToReplace == -1) {
            System.out.println("Ошибка! Актёр с фамилией " + surnameToReplace + " не найден.");
            return;
        }

        Actor oldActor = listOfActors.set(indexToReplace, newActor);

        System.out.println("Актёр " + oldActor.getName() + " " + oldActor.getSurname() +
                " заменён на актёра " + newActor.getName() + " " + newActor.getSurname() + ".");
    }
}
