import java.util.Random;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        /**
         * 15. Напишите не возвращающий метод, который берет массив из
         * рандомных чисел от 1 до 50 и еще одно целое число n.
         * Нужно вывести в консоль сколько раз число n повторялось в
         * массиве.
         */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Write array length : ");
        int arrayLength=scanner.nextInt();

        int[] numbers = new int[arrayLength];

        for (int i = 0; i <arrayLength; i++) {
            numbers[i]=random.nextInt(1,50);
        }
        System.out.print("Write n number: ");
        int n = scanner.nextInt();

        getSum(numbers,n);
    }
    public static  void getSum(int[] numbers,int n){
        int repeat =0;
        for (int i = 0; i <numbers.length; i++) {
            if(numbers[i] == n){
                repeat++;
            }
        }
        System.out.println("Chislo :"+n+" repeat "+repeat+" raz");

    }
}
