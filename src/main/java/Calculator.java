import java.util.Scanner;
import java.text.DecimalFormat;
public class Calculator {
    public static void main(String[] args) {
        }


    public static void calculation() {
        String soglasie;
        String calcul = "Ваши товары: ";
        Float sum = 0.00f;
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Напишите название товара:");
            String tovar = scan.next();



            System.out.println("Напишите стоимость товара (руб.коп.):");
            float cena = scan.nextFloat();
            sum = sum + cena;

            calcul = calcul + " " + tovar + cena;
            System.out.println("На данный момент Ваши товары: "+ calcul);
            System.out.println("Хотите заказать ещё? тогда напшите любой символ. Напишите: Завершить, если всё заказали");
            soglasie = scan.next();
            if (soglasie.equals("Завершить")){
                break;
            }
    }
}}

