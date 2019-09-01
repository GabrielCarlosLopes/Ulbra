public class exercicio6 {

    public static void main(String[] args) {

        String mes [] = new String[12];

        mes[0] = "Janeiro";
        mes[1] = "Fevereiro";
        mes[2] = "Março";
        mes[3] = "Abril";
        mes[4] = "Maio";
        mes[5] = "Junho";
        mes[6] = "Julho";
        mes[7] = "Agosto";
        mes[8] = "Setembro";
        mes[9] = "Outubro";
        mes[10] = "Novembro";
        mes[11] = "Dezembro";

        int valor = (int) (Math.random() * 11);

        switch (valor){
            case 0:
                System.out.println(mes[0]);
                break;
            case 1:
                System.out.println(mes[1]);
                break;
            case 2:
                System.out.println(mes[2]);
                break;
            case 3:
                System.out.println(mes[3]);
                break;
            case 4:
                System.out.println(mes[4]);
                break;
            case 5:
                System.out.println(mes[5]);
                break;
            case 6:
                System.out.println(mes[6]);
                break;
            case 7:
                System.out.println(mes[7]);
                break;
            case 8:
                System.out.println(mes[8]);
                break;
            case 9:
                System.out.println(mes[9]);
                break;
            case 10:
                System.out.println(mes[10]);
                break;
            case 11:
                System.out.println(mes[11]);
                break;
        }
    }
}
