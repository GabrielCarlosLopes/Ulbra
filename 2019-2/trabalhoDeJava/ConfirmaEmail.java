public class ConfirmaEmail {

    public static String confirmaEmail(String a){
        if(a.indexOf("@")!=-1){
            return a;
        } else {
            System.out.println("Email invalido");
            return null;
        }
    }
}
