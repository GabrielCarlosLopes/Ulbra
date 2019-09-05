public class meusArrays {


    public static void verificarNumero(int[] a, int[] b, int c){
        int achei = 0;
        int achei1 = 0;

        for (int x=0; x < a.length; x++){
            if (a[x] == c){
                achei = 1;
                break;
            }
        }
        for (int x=0; x < b.length; x++){
            if (b[x] == c){
                achei1 = 1;
                break;
            }
        }

        System.out.println("Retorno");

        if (achei == 1 || achei1 == 1){
            System.out.println(1);
        }
        if (achei == 0 && achei1 == 0){
            System.out.println(0);
        }
        if(achei == 1 && achei1 == 1){
            System.out.println(2);
        }
    }

    public static void gerarArray (int n){
        int i[] = new int[n];
        System.out.println("array gerado automaticamente");
        for (int x=0; x<i.length; x++){
            i[x] = (int) (Math.random()*1000);
            System.out.println(i[x]);
        }
    }


}
