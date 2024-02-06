import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        /**
         * 18. Напишите возвращающий метод типа массива int, который в
         * параметры принимает массив и возвращает новый массив
         * состоящий только из четных элементов массива А.
         */
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();

        System.out.println("Write array length: ");
        int arrayLength =  scanner.nextInt();

        int[]numbers=new int[arrayLength];
        for (int i = 0; i <numbers.length; i++) {
            numbers[i]=random.nextInt(1,50);

        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Even number of array: "+Arrays.toString(eventArray(numbers)));
    }
    public static  int[] eventArray(int[] numbers){
        int evenIndex = 0;
        for (int number:numbers) {
            if (number % 2 == 0) {
                evenIndex++;
            }
        }
            int[]evenArray = new int[evenIndex];
            int index = 0;

            for (int number: numbers){
                if(number % 2 == 0){
                    evenArray[index++] = number;

            }


        }return evenArray;

    }
}
