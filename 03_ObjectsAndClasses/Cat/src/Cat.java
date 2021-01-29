
public class Cat {

    public static final int EYES_COUNT = 2;
    public static final double MAXWEIGHT = 9000.0;
    public static final double MINWEIGHT = 1000.0;
    public static int count = 0;
    public static int n = 0; //вспомогательная переменная
    public static int i = 0; //вспомогательная переменная
    public double weight;
    private double originWeight;
    private double weightAmount;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        weightAmount = 0.0; //переменная хранит количество граммов потреблённого корма
        getCount();
    }

    //код для Урока 5 - конструктор для создания кошки с переданным в конструктор весом
    public Cat(double weight) {
        this.weight = weight;
    }
    //окончание кода для Урока 5


    public static int getCount() {
        count = count + 1;  // счётчик кошек
//        System.out.println("count" + count);
        return count;
    }


    public void meow() {
            weight = weight - 1;
            System.out.println("Meow");
    }

    public void feed(Double amount) {
        if ((weight > MINWEIGHT) && (weight < MAXWEIGHT)) //провекра по критерию веса - не мертва ли кошка и если жива - то
        {
        weight = weight + amount;
        weightAmount = weightAmount + amount; }
        else {
            System.out.println("The cat is Dead"); //иначе она мертва и есть не может
        }
    }

    public void drink(Double amount) {
        if ((weight > MINWEIGHT) && (weight < MAXWEIGHT)) //провекра по критерию веса - не мертва ли кошка и если жива - то
        {
            weight = weight + amount;
        } else {
            System.out.println("The cat is Dead"); //иначе она мертва и пить не может
        }
    }

    public Double getWeight() { //счёт не выживших кошек по критерию их оставшегося после эспериментов веса

        if ((weight < MINWEIGHT) && (n == 0)) {
            count = count - 1; //вычитаем кошку после мяуканий
            n = 1;

        } else if ((weight > MAXWEIGHT) && (i == 0)) {
            count = count - 1; //вычитаем кошку после того как лопнула
            i = 1;
        }


        return weight;
    }

    public String getStatus() {
        if (weight < MINWEIGHT) {
            return "Dead";
        } else if (weight > MAXWEIGHT) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    //сумма съеденой еды текущей кошки
    public Double getAmount() {
        return weightAmount;
    }


    //метод "Сходить в туалет"
    public void pee() {
        if ((weight > MINWEIGHT) && (weight < MAXWEIGHT)) //провекра по критерию веса - не мертва ли кошка и если жива - то
        {
            weight = weight - 5;
        System.out.println("Pee");
        } else {
            //иначе она мертва и сходить в туалет не может
            System.out.println("The cat is Dead");
        }
    }

}