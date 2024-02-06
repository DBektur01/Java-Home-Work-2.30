import java.util.Arrays;
import java.util.Random;

public class Exercise20 {
    public static void main(String[] args) {
        /**
         * 20. Напишите не возвращающий метод который получает в качестве
         * параметра не заполненный массив с размером 15.
         * Нужно массив заполнить положительными случайными
         * двузначными четными числами.
         * И вывести элементы массива в консоль в одну строку через пробел
         */

        Random random = new Random();
        int[] array = new int[15];
        System.out.println(Arrays.toString(getEvenNumbers(array)));
    }

    public static int[] getEvenNumbers(int[]numbers) {
        Random random = new Random();
        int randomNumber;

        for (int i = 0; i < numbers.length; i++) {
            do {
                randomNumber = random.nextInt(10, 100);
            } while (randomNumber % 2 != 0);

            numbers[i] = randomNumber;
        }
        return numbers;

    }
}
