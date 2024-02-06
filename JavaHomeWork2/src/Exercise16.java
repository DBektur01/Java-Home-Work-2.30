import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        /**16. Напишите метод возвращающий тип int, вы должны в параметры
         метода дать целое положительное число n.
         А метод нам вернёт сумму всех цифр от 0 до n.
*/
        Scanner scanner = new Scanner(System.in);

        int n =  scanner.nextInt();
        System.out.println("Summa: "+getSum(n));

    }public static int getSum(int n){
        int sum = 0;
        for (int i = 0; i <=n; i++) {
            sum+=i;

        }return sum;
    }
}
