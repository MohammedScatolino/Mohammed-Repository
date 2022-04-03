public class App {
    public static void main(String[] args) throws Exception {

        ContaBanco c1 = new ContaBanco("cc", "Mohammed");
        c1.abrirConta();
        c1.depositar(200);
        c1.extrato();


    }
}
