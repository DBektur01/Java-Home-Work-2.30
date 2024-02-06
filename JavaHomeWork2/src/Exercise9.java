import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        /**
         * 9. Напишите класс, который заполняет случайными
         * четырехзначными числами массив, размер которого вводится с
         * клавиатуры.
         * После заполнения класс должен вывести на экран значения
         * массива в одной строке, начиная с конца массива ( с последнего
         * индекса).
         */
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("array size: ");
        int arraySize=scanner.nextInt();

        int[]numbers=new int[arraySize];

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i]=random.nextInt(1000,10000);
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("Перевернутый массив: ");
        int[] reversedNumber= new int[arraySize];
        for (int i = 0; i <numbers.length; i++) {
            reversedNumber[i] = numbers[numbers.length-1-i];

        }
        System.out.println(Arrays.toString(reversedNumber));




    }
}
