import java.util.Scanner;

public class restoran {
    public static void main(String[] args){
        boolean siparisSonu = true;
        int toplamFiyat = 0;
        while (siparisSonu){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ne sipariş etmek  istersiniz");
            String secenekler = "Tavuk(100tl)" +
                    "Pirzola(200tl)" +
                    "Pilav(40tl)" +
                    "Kuru(70tl)" +
                    "Nohut(80tl)" +
                    "Bulgur(50tl)" +
                    "(siparişiniz bittiyse lütfen 0 giriniz)";
            System.out.println(secenekler);
            var secim = scanner.nextLine();
            switch (secim){
                case "Tavuk":
                    System.out.println("Tavuk 100 TL");
                    toplamFiyat += 100;
                    break;
                case "Pirzola":
                    System.out.println("Pirzola 200 TL");
                    toplamFiyat += 200;
                    break;
                case "Pilav":
                    System.out.println("pilav 40 TL");
                    toplamFiyat += 40;
                    break;
                case "Kuru":
                    System.out.println("Kuru 70 TL");
                    toplamFiyat += 70;
                    break;
                case "Nohut":
                    System.out.println("Nohut 80 TL");
                    toplamFiyat += 80;
                    break;
                case "Bulgur":
                    System.out.println("Bulgur 50 TL");
                    toplamFiyat += 50;
                    break;
                case "0":
                    System.out.println("Toplam Tutar:" + toplamFiyat +"   Afiyet olsun");
                    siparisSonu = false;
            }
        }


    }
}
