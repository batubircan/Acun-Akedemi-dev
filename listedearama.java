import java.util.ArrayList;
import java.util.Scanner;

public class listedearama {
    public static void main(String[] args) {

        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("istanbul");
        sehirler.add("ankara");
        sehirler.add("izmir");
        sehirler.add("adana");
        sehirler.add("antalya");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir şehir ismi giriniz (istanbul, ankara, izmir, adana, antalya): ");
        String giris = scanner.nextLine();


        int index = sehirler.indexOf(giris);


        if (index != -1) {
            System.out.println(giris + " listede bulunuyor. Index: " + index);
        } else {
            System.out.println(giris + " listemizde bulunmuyor.");
        }
    }
}
