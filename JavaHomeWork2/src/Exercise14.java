import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        /**
         * 14. Напишите не возвращающий метод который в параметры берет
         * массив из рандомных чисел от 1 до 50 и выводит в консоль только
         * те числа что больше 20.
         */
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();

        int[]numbers=new int[10];
        for (int i = 0; i <numbers.length; i++) {
            numbers[i]=random.nextInt(1,50);

        }
        getNumber(numbers);

    }
    public  static  void  getNumber(int[]numbers){
        String newNumbers= "";
        for (int i = 0; i <numbers.length; i++) {
            if(numbers[i]>20){
                newNumbers += numbers.length -1 == i ?numbers[i]:numbers[i]+ " ,";
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Chislo bolshe 20: "+newNumbers);

    }
}
