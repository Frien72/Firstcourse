package lesson10;

public class Box<T extends Fruit> {
    private T[] fruits;

    @SafeVarargs
    public Box(T... fruits) {
        this.fruits = fruits;
    }

    public boolean compare(Box<?> box) {
        return box.getWeight() == this.getWeight();
    }

    public double getWeight() {
        return fruits.length > 0 ? fruits.length * fruits[0].getWeight() : 0;
    }

    public T[] getFruits() {
        return fruits;
    }

    public T getFruit(int index) {
        checkGetIndex(index);
        return fruits[index - 1];
    }

    public int getSize() {
        return fruits.length;
    }

    public void shiftAllFruits(Box<? extends T> box) {
        fruits = box.getFruits();
        box.clearBox();
    }

    @SafeVarargs
    public final void clearBox(T... fruits) {
        this.fruits = fruits;
    }


    private void checkGetIndex(int index) {
        if (index < 1 || index > fruits.length) throw new RuntimeException("Указанный индекс отстуствует в массиве");
    }
}
