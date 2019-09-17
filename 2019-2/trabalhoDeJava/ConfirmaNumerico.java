public class ConfirmaNumerico {

    public static void confirmaNumerico(String a){

        char[] c = a.toCharArray();
        for ( int i = 0; i < c.length; i++ ) {
            if (!Character.isDigit(c[i])){
                System.out.println("nao numerico");
                break;
            }
            else{
                System.out.println("numerico");
                break;
            }
        }
    }

}
