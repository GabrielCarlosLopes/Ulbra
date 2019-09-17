public class ConfirmacaoDado {

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

    public static float confirmaFloat(String a){
        try{
            float j = Float.parseFloat(a);
            return j;
        }catch(Exception e){
            System.out.println("nao é um dado valido");
            System.exit(0);
        }

        return 0;
    }

    public static double confirmaDouble(String a){
        try{
            double j = Double.parseDouble(a);
            return j;
        }catch(Exception e){
            System.out.println("nao é um dado valido");
            System.exit(0);
        }

        return 0;
    }
}
