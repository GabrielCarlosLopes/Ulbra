import java.text.ParseException;

public class main {

    public static void main(String[] args) throws ParseException {

       Teclado.lerInt();

       Teclado.lerChar();

       Teclado.lerDouble();

       Teclado.lerFloat();

       Teclado.lerString();

        System.out.println(ConfirmaEmail.confirmaEmail(LerEmail.leEmail()));

        System.out.println(ConfirmaTelefone.corfimaTelefone(LerTelefone.telefone()));

        System.out.println(ConfirmaData.confirmaData(LerData.data()));

        System.out.println(ConverteData.converteData(ConfirmaData.confirmaData(LerData.data())));

        ConfirmaNumerico.confirmaNumerico(LeDado.leDado());
    }
}
