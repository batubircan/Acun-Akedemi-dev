import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class arraylistsıralama {

    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);


        ArrayList<Integer> sayılar = new ArrayList<Integer>();


        for (int i = 0;i< 10; i++){
            System.out.println( i+". sayıyı giriniz");
            int sayı = scanner.nextInt();
            sayılar.add(sayı);

        }
sayılar.sort(Collections.reverseOrder());
        System.out.println(sayılar);










    }
}
