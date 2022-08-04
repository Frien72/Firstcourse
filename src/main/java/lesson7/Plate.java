package lesson7;



public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int foodToDecrease) {
        food -= foodToDecrease;
    }

    public void foodIncrease(int foodToIncrease) {
        food += foodToIncrease;
    }

    public int getFood() {
        return food;
    }

    public boolean enoughFood(int appetite) {
        return food >= appetite;
    }

    public void printInfo() {
        System.out.println("В тарелке " + food + " единиц еды");
    }

}

