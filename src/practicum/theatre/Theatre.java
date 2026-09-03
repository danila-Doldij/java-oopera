package practicum.theatre;
import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Дмитрий", "Нагиев", 1.81, Gender.MALE);
        Actor actor2 = new Actor("Евгений", "Лебедев", 1.90, Gender.MALE);
        Actor actor3 = new Actor("Александра", "Петрова", 1.63, Gender.FEMALE);

        Director director1 = new Director("Пётр", "Крылов", 1.78, Gender.MALE, 32);
        Director director2 = new Director("Олег", "Дмитриев", 1.69, Gender.MALE, 63);


        ArrayList<Actor> dramaActors = new ArrayList<>();
        dramaActors.add(actor1);
        dramaActors.add(actor2);
        Show drama = new Show("Гамлет", 150, director1, dramaActors);


        ArrayList<Actor> operaActors = new ArrayList<>();
        operaActors.add(actor3);
        Opera opera = new Opera("Аида", 180, director2, operaActors, "Джузеппе Верди",
                "Либретто Антонио Гисланцони", 40);

        ArrayList<Actor> balletActors = new ArrayList<>();
        balletActors.add(actor1);
        balletActors.add(actor3);
        Ballet ballet = new Ballet("Лебединое озеро", 190, director1, balletActors,
                "Пётр Ильич Чайковский", "Либретто по мотивам Бегичева и Гельцера",
                "Иоган Шультц");


        drama.printListOfActors();
        System.out.println();

        opera.printListOfActors();
        System.out.println();

        ballet.printListOfActors();
        System.out.println();

        ballet.replaceTheActor(actor2, "Нагиев");
        ballet.printListOfActors();
        System.out.println();

        drama.replaceTheActor(actor3, "Иванов"); //Проверка на замену несуществующего актёра.

        opera.printLibrettoText();
        System.out.println();

        ballet.printLibrettoText();
        System.out.println();
    }
}
