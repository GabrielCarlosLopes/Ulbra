import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

class ConfirmaData {


    public static String confirmaData(String a){

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient (false);
        try {
            df.parse (a);
            return a;
        } catch (ParseException ex) {
            return null;
        }
    }
}