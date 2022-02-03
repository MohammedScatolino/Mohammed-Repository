
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale idioma = Locale.getDefault();
        System.out.println("O seu sistema está em "+idioma.getDisplayLanguage() +idioma.getCountry());
    }
}
