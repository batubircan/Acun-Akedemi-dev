import java.util.Scanner;
public class market {
    public static void main(String[] args) {
        int toplam = 0;
        int S = 10;
        int D = 20;
        int Y = 30;
        for (int i =0; i<100; i++){
            System.out.println("Ne satın almak istiyorsunuz?(çıkış için 0 giriniz)");
            String secenekler = "Salatalık,Domates,Yumurta";
            Scanner scanner = new Scanner(System.in);
            System.out.println(secenekler);
            String secim = scanner.nextLine();



            if (secim.equals("0")){
                System.out.println("Alış veriş sona erdi indirim kponunuz varmı? (Var/Yok)");
                String kupon = scanner.nextLine();
                if (kupon.equals("Var")) {
                    int indirim = toplam * 10 / 100;
                    System.out.println("Tebrikler %10 indirim kazandınız toplam tutar:" + toplam + "'dan " + (toplam - indirim) + "e düştü");
                }else
                    System.out.println("Yine bekleriz");
                break;
            }
            switch (secim){
                case "Salatalık":
                    System.out.println("kaç adet salatalık almak istiyorsunuz?");
                    int adetSalatalik = scanner.nextInt();
                    toplam = toplam + adetSalatalik * S;
                    System.out.println("Toplam tutar:"+ toplam);
                    scanner.nextLine();
                    break;


                case "Domates":
                    System.out.println("kaç adet domates almak istiyorsunuz");
                    int adetDomates = scanner.nextInt();
                    toplam = toplam + adetDomates * D;
                    System.out.println("Toplam tutar:" + toplam);
                    scanner.nextLine();
                    break;
                case "Yumurta":
                    System.out.println("kaç adet yumurta almak istiyorsunuz");
                    int adetYumurta = scanner.nextInt();
                    toplam = toplam + adetYumurta * Y;
                    System.out.println("Toplam tutar:"+toplam);
                    scanner.nextLine();
                    break;



            }



        }







}


}
