import java.util.ArrayList;
import java.util.Random;


public class çiftsayı {
    public static void main(String[]args){
        Random random = new Random();
        ArrayList<Integer> sayilar = new ArrayList<Integer>();
        ArrayList<Integer> ciftSayilar = new ArrayList<Integer>();

        for (int i=0 ; i<20;i++){

            int sayi = random.nextInt(100) + 1;
            sayilar.add(sayi);
            if (sayi %2 ==0){
                ciftSayilar.add(sayi);

            }
        }
        System.out.println("çift sayılar"+ciftSayilar);
    }
}
