public class Main {

    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];

        mes.getMesExtenso(7, 1);

        contagem.contar();

        contagem.contarFim(5);

        contagem.contarInicioFim(2,8);

        contagem.contarInicioFimPausa(1,5,500);

        data.mostrarData(data.getDia(), data.getMes(), data.getAno());

        senha.gerarSenha();

        for(int x=0; x<5; x++){
            a[x] = (int) (Math.random()*1000);
            b[x] = (int) (Math.random()*1000);
        }

        meusArrays.verificarNumero(a, b, 100);

        meusArrays.gerarArray(5);

    }


}
