public class exercicio1 {

    public static void main(String[] args) {

        int data [] = new int[5];

        String a = " ";

        data [0] = 1;
        data [1] = 2;
        data [2] = 3;
        data [3] = 4;
        data [4] = 5;

        for (int x : data){
            System.out.println(x);
        }

        for (int x = 0; x<5; x++){
            a += data[x];
            if ( x < 4){
                a+=",";
            }
        }

        System.out.printf(a);

    }
}
