public class exercicio1 {

    public static void main(String[] args) {
        int soma=0;
        System.out.println("A soma de tres jogadas de um dado eh:");
        for (int x=0; x<3; x++) {
            int num = (int) (Math.random() * 5) + 1;
            System.out.println(num);
            soma += num;
        }
        System.out.println("A soma das tres jogas eh "+soma);
    }
}
