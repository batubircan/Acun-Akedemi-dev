public class tekraredensayılar {
    public static void main(String[]args){
        int[] tekrar = new int[7];
        tekrar[0] = 5;
        tekrar[1] = 3;
        tekrar[2] = 8;
        tekrar[3] = 3;
        tekrar[4] = 1;
        tekrar[5] = 5;
        tekrar[6] = 8;

        for (int i=0; i<tekrar.length;i++){
            for (int j=i+1;j<tekrar.length;j++){
                if (tekrar[i] == tekrar[j]){
                    System.out.println(tekrar[i]);
                    break;
                }
            }

        }

    }
}
