package lesson8.homeWork;

public class Human implements Member{

    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void runThrough(Treadmill treadmill) {
        System.out.printf("%s пробежал по беговой дорожке %s", name, treadmill.getNumber());
        System.out.println();
    }

    @Override
    public void jumpOver(Wall wall) {
        System.out.printf("%s перепрыгнул через стену %s", name, wall.getNumber());
        System.out.println();
    }
}
