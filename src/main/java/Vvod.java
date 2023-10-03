import java.util.Scanner;
public class Vvod {
    public static void main(String[] args) {
    }
    public static String proverkaOshibokCena(String tovar,String calcul) {
        boolean wenttocatch = false;
        Scanner scan = new Scanner(System.in);
        float cena = 0;
       // String calcul = "";

        do {
            System.out.print("Напишите стоимость товара (руб,коп): ");
            if (scan.hasNextFloat()) {
                cena = scan.nextFloat();
                wenttocatch = true;
            } else {
                scan.nextLine();
                System.out.println("Ошибка! Введите данные формата руб,коп ");
            }
        } while (!wenttocatch);
        calcul = calcul + String.format("%s стомистью %.2f рублей.\n", tovar, cena);
        //x=cenos;
       return calcul;}
}
