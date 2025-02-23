import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int passWord = 1234;
        double walue = 4032.43;
        Scanner scanner = new Scanner(System.in);

        boolean check = false;

        while (!check) {
            System.out.println("Lütfen şifrenizi giriniz");

            int passWordUser = scanner.nextInt();
            if (passWordUser == passWord) {
                System.out.println("Hesabınıza başarıyla giriş yaptınız");
                break;
            }
            else {
                System.out.println("Girmiş olduğunuz şifre yanlış lütfen tekrar deneyiniz");

            }

        }

        boolean check2 = false;
        while (!check2) {
            System.out.println("Hangi işlemi gerçekleştirmek istiyorsunuz? (Bakiye sorgulama,Para çekme,Para yatırma,Çıkış)");
            var make = scanner.nextLine();

            if (make.equals("Bakiye sorgulama")) {
                System.out.println("Hesabınızdaki bakiye:"+ walue);


            }else if (make.equals("Para çekme")) {
                boolean check3 = false;
                while (!check3){
                    System.out.println("Kaç para çekmek istiyorsunuz?");

                    double take = scanner.nextDouble();
                    scanner.nextLine();

                    if (take > walue){
                        System.out.println("bakiyeniz yetersiz Şu sahip olduğunuz bakiye:"+walue);

                    }else if (take == 0){
                        System.out.println("Lütfen 0 dan farklı bir değer giriniz");

                    } else if (take < 0) {
                        System.out.println("Lütfen pozitif bir değer giriniz");
                    }else {
                        System.out.println("İşlem başarıyla gerçekleştirildi " +
                                "Yeni bakiyeniz:" + (walue - take));
                        walue = walue - take;
                        break;
                    }
                }


            } else if (make.equals("Para yatırma")) {
                boolean check4 = false;
                while (!check4){
                    System.out.println("Yatırılacak tutarı giriniz:");
                    double add = scanner.nextDouble();
                    scanner.nextLine();
                    if (add == 0){
                        System.out.println("Lütfen 0 dan farklı bir değer giriniz");
                    } else if (add < 0) {
                        System.out.println("Lütfen pozitif bir değer giriniz");

                    }else {
                        System.out.println("Para yatırma işleminiz başarıyla gerçekleştirilmiştir güncel bakiyeniz:" + (walue + add));
                        walue = walue + add;
                        break;
                    }
                }


            } else if (make.equals("Çıkış")) {
                System.out.println("Çıkış işleminiz gerçekleştiriliyor");
                break;

            }


        }


    }
}