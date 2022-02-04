import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       /*args int n1 = 3;
        int n2 = 7;
        float media = (n1+n2)/2;
        System.out.print("A média entre " +n1 + " e " + n2 + " é " + media +"\n"); */

        /*Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = teclado.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = teclado.nextInt();
        teclado.close();
        float divisao = n1/n2;
        float resto = n1 % n2;
        System.out.println("A divisão entre os valores é " + divisao + " e o resto da divisão é " + resto);*/

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor a ser calculado");
        int  valor = teclado.nextInt();
        teclado.close();
        float restoPor2 = valor % 2;
        int cubo = (int) Math.pow(valor,3);
        float raizq = (float) Math.sqrt(valor);
        float raizc = (float) Math.cbrt(valor);
        int modulo = (int) Math.abs(valor);
        System.out.println("Resto da divisão por 2 = " +restoPor2);
        System.out.println("Elevado ao cubo = " +cubo);
        System.out.println("Raiz quadrada = " +raizq);
        System.out.println("Raiz cúbica = " +raizc);
        System.out.println("Módulo = " +modulo);







    }
}
