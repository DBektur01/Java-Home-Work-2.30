import java.util.Random;

public class Exercise2 {
    public static void main(String[] args) {
        /**
         * Напишите класс, который генерирует 20 рандомных целых чисел
         из диапазона -50 до +50, и определяет наименьшее число и
         наибольшее число
         */
        Random random = new Random();
        int max=0;
        int min=0;
        String numbers="";

        for (int i = 0; i <20 ; i++) {
            int randomNumber=random.nextInt(-50,50);
            numbers += i !=19 ?randomNumber+ ", ": randomNumber;

            if(randomNumber>max){
                max=randomNumber;
            }
            if(randomNumber<min){
                min=randomNumber;
            }

        }
        System.out.println("Все рандомные числа: [" +numbers+ "]");
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);

    }
}
