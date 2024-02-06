import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        /**
         * 13. Напишите не возвращающий метод, который берет в параметры
         * массив из boolean типа, и выводит в консоль количество true
         * элементов массива.
         */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Write array length : ");
        int arrayLength=scanner.nextInt();

        boolean[] booleans = new boolean[arrayLength];

        for (int i = 0; i <arrayLength; i++) {
            booleans[i]=random.nextBoolean();
        }

        getTrueLength(booleans);
    }
    public  static void getTrueLength(boolean[] array){
        int trues=0;
        for (int i = 0; i <array.length; i++) {
            if(array[i] ){
                trues++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(" True: "+trues);

    }
}
