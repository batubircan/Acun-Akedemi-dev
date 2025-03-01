public class negatifpozitif {
    public static void main(String[]args){

        int[] tekrar = new int[7];
        tekrar[0] = -5;
        tekrar[1] = 3;
        tekrar[2] = -8;
        tekrar[3] = 3;
        tekrar[4] = -1;
        tekrar[5] = 5;
        tekrar[6] = -8;
         int toplamNegatif=0;
         int toplamPozitif=0;


        for (int sayı:tekrar){
            if(sayı<0){
                toplamNegatif += sayı;
            } else {
                toplamPozitif += sayı;
            }

        }
        System.out.println(toplamNegatif );
        System.out.println(toplamPozitif);
    }
}
