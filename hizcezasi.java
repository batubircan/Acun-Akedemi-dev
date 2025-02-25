import java.util.Scanner;

public class hizcezasi {
    public static void main(String[] args){
        System.out.println("Kaç km Hız ile hareket ediyor?");
        Scanner scanner = new Scanner(System.in);
        int hiz = scanner.nextInt();
        if (hiz >=90 && hiz <=120 ){
            System.out.println("1000 TL ceza kesilecek");
            
        } else if (hiz >120 && hiz <= 130) {
            System.out.println("2000 TL ceza kesilecek");
            
        }else if (hiz <90 && hiz >=0){
            System.out.println("Herhangi bir cezai işlem uygulanmayacaktır");
        } else if (hiz <0) {
            System.out.println("Lütfen geçerli bir hız giriniz");
        } else {
            System.out.println("Ehliyete el konulacak");
        }
    }
}
