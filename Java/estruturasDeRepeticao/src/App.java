import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*int contador = 1;
        while (contador <= 4) {
            System.out.println(contador);
            contador++;
        }*/


        /*int contador = 1;
        while (contador <= 4) {
            if (contador == 3) {
                contador++;
                continue;
            }
            System.out.println(contador);
            contador++;           
        }*/


        /*int contador = 1;
        while (contador <= 7) {
            if (contador == 3) {
                contador++;
                continue;
            }
            if (contador == 6) {
                break;
            }
            System.out.println(contador);
            contador++;
        }*/
        
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do fatorial X!:");
        int contador = teclado.nextInt();
        teclado.close();
        int f = 1;
        while (contador>=1){
            f *= contador;
            contador--;
        }
        System.out.println("O fatorial é " + f);*/


        /*int contador = 1;
        do {
            System.out.println(contador);
            contador++;
        } while (contador <=4);*/



        /*String resposta;
        int soma = 0, numero;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("Digite o valor a ser somado:");
            numero = teclado.nextInt();
            soma += numero;
            System.out.println("Deseja Continuar [S/N]");
            resposta = teclado.next();         
        } while (resposta.equals("S"));
        teclado.close();
        System.out.println("A soma final é " + soma);*/



        for (int cont = 0; cont <= 4; cont++) {
            System.out.println(cont);
        }










    
    }
}
