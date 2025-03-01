import java.util.Arrays;

public class dizimethot {
    public static void main(String[]args){

        /* arrays.sort methodu diziyi küçükten büyüğe sıralar eğer dizin içerisindeki veriler string ise A,B,C şeklinde sıralanır*/

        int[] sayilar = {5, 2, 9, 1, 7, 6,8,9,12,43,13};


        Arrays.sort(sayilar);


        System.out.println("liste: " + Arrays.toString(sayilar));

        /* sıralı bir dizide bir elemanı 2li aram sistemi kullanarak arar bu metod elemanın dizindeki index'ini dödürür
        * Eğer eleman dizide bulunmazsa, elemanın dizide olması gereken yerin negatif index'ini döndürür. */

        int index = Arrays.binarySearch(sayilar, 5);


        if (index >= 0) {
            System.out.println("5 bulundu, index: " + index); // Çıktı: 5 bulundu, index: 2
        } else {
            System.out.println("5 bulunamadı.");
        }

        /* bir dizinin belirli bir aralığını kopyalamak için kullanılır. */

        int[] yeniDizi = Arrays.copyOfRange(sayilar, 2, 6);


        System.out.println("Yeni dizi: " + Arrays.toString(yeniDizi));

        /*  iki dizinin eşit olup olmadığını kontrol etmek için kullanılır. Bu metod, iki dizinin uzunluklarını ve içeriklerini karşılaştırır.
        * eğer ikidizin aynı ise true değilse false döner */

        int[] dizi1 = {1, 2, 3, 4, 5};
        int[] dizi2 = {1, 2, 3, 4, 5};
        int[] dizi3 = {1, 2, 3, 4};


        boolean esitMi1 = Arrays.equals(dizi1, dizi2);
        boolean esitMi2 = Arrays.equals(dizi1, dizi3);


        System.out.println("dizi1 ve dizi2 eşit mi? " + esitMi1);

        System.out.println("dizi1 ve dizi3 eşit mi? " + esitMi2);

        /* bir dizinin tüm elemanlarını veya belirli bir aralığını belirtilen bir değerle doldurmak için kullanılır. */

        int[] sayilar2 = new int[5];


        Arrays.fill(sayilar2, 10);


        System.out.println("Dizi: " + Arrays.toString(sayilar2));
    }
}
