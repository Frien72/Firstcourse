package lesson9;

public class Main {

    private static final int ARRAY_SIZE = 4;

    public static void main(String[] args) {

        String array[][] = new String[][]
                {{"1","2","3","4"}, {"4", "5", "6", "7"}, {"8", "9", "10", "11"}, {"12", "13", "14", "15"}};
        int result = 0;
        try {
           result = sum(array);
        } catch (MyArrayDataException e) {
            throw new RuntimeException(e.getMessage(), e);
        } catch (MyArraySizeException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
        System.out.printf("Сумма всех чисел в массиве равна %s",result);
    }


    public static int sum(String[][] array) throws MyArrayDataException, MyArraySizeException {
        if (array.length != ARRAY_SIZE || array[0].length != ARRAY_SIZE) {
            throw new MyArraySizeException("ОШИБКА! Некорректный размер массива");
        }
        int sum = 0;
        for (int i = 0; i < ARRAY_SIZE; i++) {
            for (int j = 0; j < ARRAY_SIZE; j++) {
                String value = array[i][j];
                try {
                    int number = Integer.parseInt(value);
                    sum += number;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("ОШИБКА! Элементы массива должны быть числом");
                }

            }
        }
        return sum;
    }

}
