import java.util.Scanner;
import java.text.DecimalFormat;
public class Calculator {
    public static void main(String[] args) {
    }


    public static void calculation() {
        String soglasie;
        String calcul = ""; //"Ваши товары: ";
        Float sum = 0.00f;
        Float cena = -10.00f;
        double count = 10;
        String tovar=" ";
        Scanner scan = new Scanner(System.in);
        while (true) {
         //   if (cena instanceof Float & cena>=0) {
                System.out.println("Напишите название товара:");
              //  cena = -10.00f;
          //  }
                tovar = scan.next();




            System.out.println("Напишите стоимость товара (руб.коп.):");
            try {
                cena = scan.nextFloat();
            } catch (Exception e) {
                System.out.println("Ошибка: Напишите еще раз");

                }
                //   if (cena instanceof Float){
                //     break;
                //  }else System.out.println("Ошибка неверный ввод, попробуйте еще раз: ");
                //  }

               // sum = sum + cena;
                 // double poslDve = Math.floor(cena * count);
               // calcul = calcul + " " + tovar + " %.2f"; //+ cena;
                //  if (poslDve%100>=11&&poslDve%100<=14){
                 //  calcul = calcul + String.format("%s стомистью %.2f рублей.", tovar, cena);

                // } else if (poslDve%10 == 1) {
               //       calcul = calcul + String.format("%s стомистью %.2f рубль.", tovar, cena);
                //  }





            //cena = (Float)cena;
            /*  int money;
                   money = int cena;
            int x=money%10;
            if (money%100>=11&&money%100<=14)
            {
                System.out.println(money+ " рублей");
            }
            else
            {
                switch (x)
                {
                    case 1:
                        System.out.println(money+ " рубль");
                        break;
                    case 2:
                    case 3:
                    case 4:
                        System.out.println(money+ " рубля");
                        break;
                    default:
                        System.out.println(money+ " рублей");
                }
            }
*/


             //  if (cena instanceof Float & cena>=0){
                calcul = calcul + String.format("%s стомистью %.2f рублей.\n", tovar, cena);
                System.out.println("Добавленные товары:\n " + calcul);
                System.out.println("Хотите заказать ещё? тогда напшите любой символ. Напишите: Завершить, если всё заказали");
                soglasie = scan.next();
                if (soglasie.equals("Завершить")) {

                    break;
                }}
            }
        }


