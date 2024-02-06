import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        /**
         *  Напишите класс, который принимает с консоли для переменной X
         * целое положительное число, а затем дополнительно будет
         * спрашивать ещё числа, эти числа будут должны вычитаться из
         * переменной x, вы будете вводить числа до тех пор пока X не будет
         * отрицательным или равен 0.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сан жазыныз");
        int x=scanner.nextInt();
        while (x>0) {
            System.out.println("Obsh summa: " + x);
            System.out.println("Сан жазыныз");
            x -= scanner.nextInt();
        }
    }
}
