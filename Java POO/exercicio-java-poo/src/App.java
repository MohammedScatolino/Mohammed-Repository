public class App {
    public static void main(String[] args) throws Exception {

        Caneta c1 = new Caneta();
        c1.cor = "azul";
        c1.carga = 90;
        c1.modelo = "bic";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.status();
        c1.rabiscar();

    }
}
