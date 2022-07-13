package lesson5;

public class workerQuestionnaires {
    private static final int SIZE = 5;

    public static void main(String[] args) {
        worker[] workerArray = new worker[SIZE];
        workerArray[0] = new worker("Ivan", "gamer", "weweqwe@asfs.wcw", "1231", 100,
                41);
        workerArray[1] = new worker("Vanya", "gamer", "weweqwwe@asfs.wcw", "12231", 130,
                22);
        workerArray[2] = new worker("Vanusha", "game2r", "weweqwfe@asfs.wcw", "12331", 150,
                4);
        workerArray[3] = new worker("Ivanich", "gamer", "weweqwee@asfs.wcw", "13231", 500,
                55);
        workerArray[4] = new worker("Vanchous", "gamer", "weweqwef@asfs.wcw", "1231", 160,
                13);
        for (int i = 0; i < SIZE; i++) {
            if (workerArray[i].age > 40) {
                System.out.println(workerArray[i]);
            }

        }
    }
}
