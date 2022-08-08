package lesson8.homeWork;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Robot robo = new Robot("Robo");
        Cat boris = new Cat("Boris");
        Human lev = new Human("Lev");

        Wall firstWall = new Wall(1);
        Wall secondWall = new Wall(2);

        Treadmill firstTreadmill = new Treadmill(1);
        Treadmill secondTreadmill = new Treadmill(2);

        Member[] members = new Member[]{robo, boris, lev};

        Wall[] walls = new Wall[]{firstWall, secondWall};

        Treadmill[] treadmills = new Treadmill[]{firstTreadmill, secondTreadmill};

        for (Member member : members) {
            for (Wall wall : walls) {
                member.jumpOver(wall);
            }
        }

        for (Member member : members) {
            for (Treadmill treadmill : treadmills) {
                member.runThrough(treadmill);
            }
        }

        }
    }

