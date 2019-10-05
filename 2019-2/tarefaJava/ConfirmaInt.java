public class ConfirmaInt {

    public static int confirmaInt(String a){
        try{
            int j = Integer.parseInt(a);
            return j;
        }catch(Exception e){
            System.out.println("nao é um dado valido");
            System.exit(0);
        }
        return 0;
        }
}
