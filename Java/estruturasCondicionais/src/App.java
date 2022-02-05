import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota 1");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a nota 1");
        float n2 = teclado.nextFloat();
        teclado.close();
        float m = (n1+n2)/2;
        if  (m >= 7) {
            System.out.println("EXCELENTE!");
        }
        System.out.printf("Sua média foi " + m );





    }
}
