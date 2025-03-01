import java.util.ArrayList;
import java.util.Scanner;

public class enBüyükEnKücük {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList<>();

        System.out.println("Lütfen 10 tane sayı giriniz:");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". sayı: ");
            sayilar.add(scanner.nextInt());
        }

        int enBuyuk = sayilar.get(0);
        int enKucuk = sayilar.get(0);

        for (int sayi : sayilar) {
            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("en büyük sayı: " + enBuyuk);
        System.out.println("en küçük sayı: " + enKucuk);
    }
}