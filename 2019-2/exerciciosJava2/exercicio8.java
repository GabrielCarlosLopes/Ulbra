public class exercicio8 {

    public static void main(String[] args) {

        int par [] = new int[10];
        int impar [] = new  int[10];

        for (int x=0; x<10; x++){
            int valor = (int) (Math.random()*20+1);
            if (valor % 2 == 0) {
                par[x] = valor;
            } else {
                impar[x] = valor;
            }
        }

        System.out.println("PAR");
        for (int x=0; x<10; x++){
            System.out.println(par[x]);
        }

        System.out.println("IMPAR");
        for (int x=0; x<10; x++){
            System.out.println(impar[x]);
        }

    }




}
