public class exercicio3 {

    public static void main(String[] args) {
        int num=10;
        int senha[] = new int[num];

        num = (int) (Math.random() * 5)+5;

        for (int x=0; x < num; x++){
            senha[x] = (int) (Math.random() *5)+5;
        }

        System.out.println("Numero sorteado "+num);
        System.out.println("Senha:");
        for (int x=0; x<num; x++) {
            System.out.println(senha[x]);
        }
    }
}
