
public class Loader
{
     public static void main(String[] args)
    {
        Cat murka = new Cat();
        Cat vasya = new Cat();
        Cat bantik = new Cat();
        Cat chernysh = new Cat();
        Cat boris = new Cat();
        Cat fantik = new Cat();

        //хорошо, что это не коты, а всего лишь объекты :)

        //первый "подопытный кролик" - кот Бантик )))
        System.out.println("For Bantik:");
        System.out.println("Weight Bantik before first 'meow' is: " + bantik.getWeight() + " gr" +
                ". Status is: " + bantik.getStatus());
        //заставляем Бантика мяукать до "смерти"
        int countBantik = 1;
        String statusBantik = "Playing";
        while (bantik.getStatus().equals(statusBantik)) {
            bantik.meow();
            countBantik++;
        }
        bantik.getWeight();
        System.out.print("Bantik is " + bantik.getStatus() + " after " + countBantik + " meow");
        System.out.println(". Weight for moment of Dead: " + bantik.getWeight() + " gr.");
        System.out.println();

        //а вот судьба Мурки...
        System.out.println("For Murka:");
        System.out.println("Weight Murka before feed is: " + murka.getWeight() + " gr. Status is: " + murka.getStatus());
        // закармливаем её пока не "лопнет")
        int countMurka = 1;
        String statusMurkaPlaying = "Playing";
        String statusMurkaSleeping = "Sleeping";
        while ((murka.getStatus().equals(statusMurkaPlaying)) || (murka.getStatus().equals(statusMurkaSleeping))) {
            murka.feed(countMurka * 1.0); //пришлось умножить на коэффициент 1.0 для приведения к соотвествию типов
            countMurka++;
        }
        System.out.println("Feed, feed, fedd... after lots of feed...");
        System.out.print("Murka is " + murka.getStatus());
        System.out.println(". Weight after feed: " + murka.getWeight() + " gr.");
        System.out.println();

        //что будет делать Васька, когда выпьет и, какой у него станет вес...
        System.out.println("For Vasya:");
        System.out.println("Weight Vasya is: " + vasya.getWeight() + " gr" +
                ". Status is: " + vasya.getStatus());
        System.out.println("Drink... after drink...");
        vasya.drink(1.0);
        System.out.print("Vasya is " + vasya.getStatus());
        System.out.println(". Weight after drink: " + vasya.getWeight() + " gr.");
        //Васька заснул и остался жив! )))
        System.out.println();

        //котам Борису и Чернышу повезло - у них мы только измерим вес, покормим и дадим попить

        //для кота Черныша
        System.out.println("For Chernysh:");
        System.out.println("Weight Chernysh is: " + chernysh.getWeight() + " gr" +
                ". Status is: " + chernysh.getStatus());
        chernysh.meow();
        System.out.println("Weight Chernysh after meow is: " + chernysh.getWeight() + " gr" +
                ". Status is: " + chernysh.getStatus());
        chernysh.drink(150.0);
        System.out.println("Drink... after drink...");
        System.out.println("Weight Chernysh after drink is: " + chernysh.getWeight() + " gr" +
                ". Status is: " + chernysh.getStatus());
        System.out.println();

        //для кота Бориса
        System.out.println("For Boris:");
        System.out.println("Weight Boris is: " + boris.getWeight() + " gr" +
                ". Status is: " + boris.getStatus());
        boris.meow();
        System.out.println("Weight Boris after meow is: " + boris.getWeight() + " gr" +
                ". Status is: " + boris.getStatus());
        boris.feed(130.0);
        System.out.println("Feed... after feed...");
        System.out.println("Weight Boris after feed is: " + boris.getWeight() + " gr" +
                ". Status is: " + chernysh.getStatus());
        boris.meow();

        fantik.feed(150.0); // Фантика покормили кормом весом в 150 гр.
        fantik.feed(100.0); //Фантика покормили кормом весом в 100 гр.
        fantik.pee(); // Фантик сходил в туалет
        fantik.pee(); // Фантик сходил в туалет
        System.out.println("Общий вес съеденного корма Фантиком: " + fantik.getAmount() + "гр.");
    }
}