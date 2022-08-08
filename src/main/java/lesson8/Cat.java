package lesson8;

public class Cat implements CanJump, CanRun, Member {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
            System.out.printf("%s перепрыгнул стену", name);
            System.out.println();
    }

        @Override
        public void run () {
                System.out.printf("%s пробежал дистанцию", name);
                System.out.println();
        }

    @Override
    public void member() {

    }
}
