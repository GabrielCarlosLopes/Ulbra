public class senha {

    public static void gerarSenha(){
        int [] x = new int[8];
        System.out.println("SENHA");
        for(int i=0; i<8; i++){

            x[i] = (int) (Math.random()*8);

            System.out.println(x[i]);
        }

    }
}
