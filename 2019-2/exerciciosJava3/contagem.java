public class contagem {

    public static void contar () {
        System.out.println("Numeros de 1 a 10");
        for(int x=1; x<=10; x++){
            System.out.println(x);
        }
    }

    public static void contarFim (int n){
        System.out.println("Numeros de 1 ate " + n);
        for (int x=1; x <= n; x++){
            System.out.println(x);
        }
    }

    public static void contarInicioFim (int n, int m){
        System.out.println("Numeros de " + n + " ate " + m);
        for(int x = n; x <= m; x++){
            System.out.println(x);
        }
    }

    public  static void contarInicioFimPausa (int n, int m, int p){
        System.out.println("Numeros de " + n + " ate " + m);
        for(int x = n; x <= m; x++){
            System.out.println(x);
            try {
                Thread.sleep(p);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
