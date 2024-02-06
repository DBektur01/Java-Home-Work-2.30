import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        /**
         * Напишите класс, который принимает с клавиатуры целое число
         * любой длины и выводит на экран:
         * ● в первой строке - все четные цифры этого числа, через пробел
         * ● во второй строке - все нечетные цифры этого числа, через
         * пробел
         * Например, для числа 765873 в первой строке будет выведены числа
         * 6 8, а во второй строке 7 5 7 3
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.println("ведите целое число");
        long number = scanner.nextInt();

        System.out.println(getEvenDigits(number));
        System.out.println(getOddDigits(number));
    }

    public static String getEvenDigits(long number) {
        String evenDigits ="";
        while (number>0){
            long digit = number % 10;
            if(digit % 2 ==0){
                evenDigits=digit + " " + evenDigits;
            }
            number/=10;
        }
        return evenDigits;
    }
    public static String getOddDigits(long number) {
        String oddDigits ="";
        while (number>0){
            long digit = number % 10;
            if(digit % 2 ==1){
                oddDigits=digit + " "+oddDigits;
            }
            number/=10;


    }
        return oddDigits;
    }
    }


