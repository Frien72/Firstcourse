package lesson7;

public class Main {
    private static final int TOTAL_CATS = 6;
    private static final int DAY = 5;
    static int day = 1;


    public static void main(String[] args) {
        Plate plate = new Plate(150);
        plate.printInfo();


        Cat[] cats = new Cat[TOTAL_CATS];
        cats[0] = new Cat("Борька", 50);
        cats[1] = new Cat("Барсук", 32);
        cats[2] = new Cat("Бориандр", 40);
        cats[3] = new Cat("Борундий", 22);
        cats[4] = new Cat("Бурундук", 31);
        cats[5] = new Cat("Альфред", 5);

        for (int a = 0; a < DAY; a++) {
            System.out.println("День: " + day);
            System.out.println();
            plate.printInfo();

            for (int i = 0; i < TOTAL_CATS; i++) {
                cats[i].setHungry(true);
                cats[i].eat(plate);
                plate.printInfo();
                System.out.println();

            }
            plate.foodIncrease(130);
            day++;
        }
    }
    }


