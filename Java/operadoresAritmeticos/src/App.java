import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       /*args int n1 = 3;
        int n2 = 7;
        float media = (n1+n2)/2;
        System.out.print("A média entre " +n1 + " e " + n2 + " é " + media +"\n"); */

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = teclado.nextInt();
        teclado.close();
        float divisao = n1/n2;
        float resto = n1 % n2;
        System.out.println("A divisão entre os valores é " + divisao + " e o resto da divisão é " + resto);
    }
}
