import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class kelimesıralama {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> kelimeler=new ArrayList<String>();

        for (int i=0 ;i<10;i++){
            System.out.println(i+". kelimeyi giriniz");
             String kelime = scanner.nextLine();
             kelimeler.add(kelime);

        }
        Collections.sort(kelimeler);
        System.out.println(kelimeler);
    }
}
