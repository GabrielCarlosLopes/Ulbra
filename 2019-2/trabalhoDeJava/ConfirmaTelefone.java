public class ConfirmaTelefone {

    public static String corfimaTelefone(String a){
        if(a.charAt(3) == '-'){
            return a;
        }else {
            return null;
        }
    }
}
