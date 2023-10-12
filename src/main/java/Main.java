import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String gostSum="";

        System.out.println("На скольких человек необходимо разделить счёт?");
        Scanner scan = new Scanner(System.in);

        boolean wenttocatch = false;
        int number = 2;
        do{
            System.out.print("Введите число : ");
            if(scan.hasNextInt()){
                number= scan.nextInt();
                if(number>=2){
                wenttocatch = true;}else System.out.println("Ошибка! Введите число больше 1: ");
            }else{
                scan.nextLine();
                System.out.println("Ошибка! Неккоректное число, введите еще раз: ");
            }
        }while(!wenttocatch);

        // Vvod.proverkaOshibokTovar();
        Calculator.calculation(number);


    }

}