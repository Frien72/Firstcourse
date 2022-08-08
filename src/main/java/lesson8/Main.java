package lesson8;

public class Main {
    public static void main(String[] args) {

        Human borya = new Human("Боря");
        Cat boris = new Cat("Борис");
        Robot sirob = new Robot("Сироб");

        Wall firstWall = new Wall(1);
        Wall secondWall = new Wall(2);

        Treadmill firstTreadmill = new Treadmill(1);
        Treadmill secondTreadmill = new Treadmill(2);

        Member[] members = new Member[] {borya, boris, sirob};

        Wall[] walls = new Wall[] {firstWall, secondWall};
        Treadmill[] treadmills = new Treadmill[]{firstTreadmill, secondTreadmill};







    }


}
