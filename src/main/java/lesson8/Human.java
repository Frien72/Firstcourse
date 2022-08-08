package lesson8;

public class Human implements CanRun, CanJump, Member{

    private String name;

    public Human (String name) {
        this.name = name;
    }


    @Override
    public void jump() {
        System.out.printf("%s перепрыгнул стену", name);
        System.out.println();

    }

    @Override
    public void run() {
        System.out.printf("%s пробежал дистанцию", name);
        System.out.println();
    }

    @Override
    public void member() {

    }
}
