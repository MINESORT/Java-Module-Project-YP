import java.util.Scanner;
public class Vvod {
    public static void main(String[] args) {
    }
    public static String proverkaOshibokCena(String tovar,String calcul, String rubli, int number, String soglasie) {

        boolean wenttocatch = false;
        float sum =0.00f;
        String rubliDlaSum = " ";
        Scanner scan = new Scanner(System.in);
        Float cena = 0.00f;
       // String calcul = "";
        while (true) {

            System.out.print("Напишите стоимость товара (руб,коп): ");
        do {

            if (scan.hasNextFloat()) {
                cena = scan.nextFloat();
                wenttocatch = true;
                sum = sum + cena;
            } else {
                scan.nextLine();
                System.out.println("Ошибка! Введите данные формата руб,коп ");
            }
        } while (!wenttocatch);

            System.out.println("Напишите название товара:");
            tovar = scan.next();
        float k=sum/number;
        rubli =  GetRubleAddition(cena,rubli);
        rubliDlaSum =  GetRubleAddition(sum,rubli);
        if (cena instanceof Float & cena>=0.01f){

        calcul = calcul + String.format("%s стомистью %.2f %s.\n", tovar, cena,rubli);

        String global =String.format("\nКакждый гость должен будет заплатить %.2f %s\n",  k, rubliDlaSum);
        System.out.println(global);
        System.out.println("Добавленные товары:\n " + calcul);
        System.out.println("Хотите заказать ещё? тогда напшите любой символ. Напишите: Завершить, если всё заказали");
        soglasie = scan.next();
            if (soglasie.equalsIgnoreCase("Завершить")) {
                System.out.println("\nВ итоге Добавленные товары:\n " + calcul);
                calcul = calcul + String.format("%s стомистью %.2f %s.\n", tovar, cena,rubli);
                System.out.println(global);
                break;
            }}
       cena=0.00f;}

       return calcul;
    }
    public static String GetRubleAddition(float num, String rubli)
    {
        int RublConvert = (int) Math.floor(num);
        var preLastDigit = RublConvert % 100 / 10;
        if (preLastDigit == 1)
        {
            return "рублей";
        }

        switch ( RublConvert % 10)
        {
            case 1:
                return "рубль";
            case 2:
            case 3:
            case 4:
                return "рубля";
            default:
                return "рублей";
        }
    }

}
