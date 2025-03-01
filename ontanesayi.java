import java.util.Scanner;

public class ontanesayi {
    public static void main(String[]args){
        int [] sayılar =new int[10];
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<sayılar.length;i++  ){
            System.out.print((i + 1) + ". sayıyı girin: ");
            sayılar[i] = scanner.nextInt();
        }

        System.out.println("50'den büyük olan sayılar");
        for (int sayı : sayılar ){
            if (sayı > 50){
                System.out.println(sayı);
            }
        }

    }
}
