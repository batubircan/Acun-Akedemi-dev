import java.util.Scanner;

public class Dersnotu {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Matematik notunuzu girin");
       int mat = scanner.nextInt();
       System.out.println("Edebiyat notunuzu girin");
       int edebiyat = scanner.nextInt();
       System.out.println("Sosyal bilgiler notunuzu girin");
       int sosyal = scanner.nextInt();
       System.out.println("İngilizce notunuzu girin");
       int ingilizce = scanner.nextInt();
       System.out.println("Fizik notunuzu girin");
       int fizik = scanner.nextInt();

       int toplam = mat + edebiyat + sosyal + ingilizce + fizik;

       var ortalama = toplam / 5;

        if (mat<= 30 && edebiyat <= 30 && sosyal <= 30 && ingilizce <= 30 && fizik <= 30){
            System.out.println("Düşük notuz bulunmaktadır");
        }

        if (ortalama>=50) {
            System.out.println("Tebrikler "+ortalama+"ortalama ile geçtiniz");
        }else {
            System.out.println(ortalama+"İle kaldınız");
        }
        int enYuksek = mat;
        int enDusuk =  mat;

        if (edebiyat > enYuksek) enYuksek = edebiyat;
        if (sosyal > enYuksek) enYuksek = sosyal;
        if (ingilizce > enYuksek) enYuksek = ingilizce;
        if (fizik > enYuksek) enYuksek = fizik;

        if (edebiyat < enDusuk) enDusuk = edebiyat;
        if (sosyal < enDusuk) enDusuk = sosyal;
        if (ingilizce < enDusuk) enDusuk = ingilizce;
        if (fizik < enDusuk) enDusuk = fizik;
        System.out.println("En yüksek notunuz:"+enYuksek);
        System.out.println("En düşük notunuz:"+enDusuk);


    }
    }

