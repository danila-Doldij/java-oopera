package practicum.theatre;

import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Дмитрий", "Нагиев", 1.81, Gender.MALE);
        Actor actor2 = new Actor("Евгений", "Лебедев", 1.90, Gender.MALE);
        Actor actor3 = new Actor("Александра", "Петрова", 1.63, Gender.FEMALE);

        Director director1 = new Director("Пётр", "Крылов", Gender.MALE, 32);
        Director director2 = new Director("Олег", "Дмитриев", Gender.MALE, 63);


        ArrayList<Actor> dramaActors = new ArrayList<>();
        Show drama = new Show("Гамлет", 150, director1, dramaActors);
        drama.addActor(actor1);
        drama.addActor(actor2);

        ArrayList<Actor> operaActors = new ArrayList<>();
        Opera opera = new Opera("Аида", 180, director2, operaActors, "Джузеппе Верди",
                "Либретто Антонио Гисланцони", 40);
        opera.addActor(actor3);

        ArrayList<Actor> balletActors = new ArrayList<>();
        Ballet ballet = new Ballet("Лебединое озеро", 190, director1, balletActors,
                "Пётр Ильич Чайковский", "Либретто по мотивам Бегичева и Гельцера",
                "Иоган Шультц");
        ballet.addActor(actor1);
        ballet.addActor(actor3);


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
        System.out.println();

        opera.printLibrettoText();
        System.out.println();

        ballet.printLibrettoText();
        System.out.println();
    }
}
