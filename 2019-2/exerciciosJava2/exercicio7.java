public class exercicio7 {

    public static void main(String[] args) {

        int matriz [][] = new int[40][40];

        for (int l=0; l<40; l++){
            for(int c=0; c<40; c++){
                matriz[l][c] = (int) (Math.random()*255);
            }
        }

        System.out.println("MATRIZ"+"\n");
        for (int l=0; l < matriz.length; l++) {
            for (int c = 0; c < matriz[0].length; c++) {
                System.out.print(matriz[l][c]+"  ");
                if ( c == matriz.length -1 ){
                    System.out.println();
                }
            }
        }

    }
}
