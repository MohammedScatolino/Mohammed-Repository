import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int aleatorio = (int) (1 + Math.random() * 6 - 1);
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        leitor.close();
        boolean resposta = (aleatorio==n);
        System.out.println(resposta);



    }   
}
