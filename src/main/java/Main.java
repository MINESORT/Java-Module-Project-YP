import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        System.out.println("На скольких человек необходимо разделить счёт?");

        Scanner scan = new Scanner(System.in);


        // метод проверки данных пользователя
        while(true){
            int number = scan.nextInt();
            if (number <=1){
                System.out.println("Количество человек должно превышать 1. Повторите запрос.");
            }else break;

        }
        System.out.println("ПРОШЛО");

    }
}