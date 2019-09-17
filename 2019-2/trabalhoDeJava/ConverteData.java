import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConverteData {

    public static String converteData(String a) throws ParseException {

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        df.setLenient(false);
        Date d = df.parse(a);
        df = new SimpleDateFormat("MM/dd/yyyy");
        return df.format(d);
    }
}
