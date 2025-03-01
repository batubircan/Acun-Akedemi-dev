import java.util.ArrayList;

public class method {
    public static void main(String[]args){


        /*get metodu belirli bir idexe karşılık gelen değeri döndürür*/

                ArrayList<String> sehirler = new ArrayList<>();
                sehirler.add("Ankara");
                sehirler.add("İstanbul");
                sehirler.add("İzmir");


                String sehir = sehirler.get(1);
                System.out.println("1. index'teki şehir: " + sehir);

        /*set metodu belirli bir indexteki elemeni değiştirmek için kullanılır*/

        String eskiSehir = sehirler.set(1, "Bursa");


        System.out.println("Değişen şehir: " + eskiSehir);
        System.out.println("değişmiş liste: " + sehirler);

        /* remove methodu belirli bir indexi veya veriyi silmemize yarar*/

        String sil = sehirler.remove(1);

        System.out.println("silinmiş liste: " + sehirler);

        /* clear methodu listenin içindeki tüm elemanları siler */

        sehirler.clear();

        /* size methodu listenin içindeki eleman sayısını gösterir*/

        int elemanSayisi = sehirler.size();

        System.out.println("Listedeki eleman sayısı: " + elemanSayisi);

    }

}
