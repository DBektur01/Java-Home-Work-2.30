import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        /**7. Напишите класс, который принимает с клавиатуры целое число
         любой длины и строит из него число с обратным порядком цифр.
         Новое значение следует вывести в консоль*/
        Scanner scanner = new Scanner(System.in);
        int num=scanner.nextInt();
        String a=String.valueOf(num);
        for (int i = a.length(); i >0; i--) {
            System.out.print(i);

        }
        /**
         * Scanner scanner = new Scanner(System.in);
         * int num=scanner.nextInt();
         * int swet = 0;
         * while(num != 0){
         * swet=swet * 10 + num % 10;
         * num/=10;
         * }
         */

    }
}
