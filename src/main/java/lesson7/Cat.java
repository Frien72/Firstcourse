package lesson7;



public class Cat {

    private final String name;
    private final int appetite;
    private boolean hungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }


    public void setHungry(boolean hungry) {
        this.hungry = hungry;

    }

    public void eat(Plate plate) {
        if (plate.enoughFood(appetite)) {
            plate.decreaseFood(appetite);
            setHungry(false);
            printFull();
            System.out.println();
        }
        else {
            setHungry(true);
            printHungry();
            System.out.println();
        }
    }
        public String getName () {
            return name;
        }
        public int getAppetite () {
            return appetite;
        }

        public boolean isHungry () {
            return hungry;
        }


        private void printFull() {
            System.out.printf("%s съел %s единиц еды и уже не голоден ^_^ (Голоден: %s)",name, appetite, hungry);
        }
        private void printHungry() {
            System.out.printf("%s очень голоден и скребется возле миски, ему не хватило еды >_< (Голоден: %s)", name, hungry);
        }

    }



