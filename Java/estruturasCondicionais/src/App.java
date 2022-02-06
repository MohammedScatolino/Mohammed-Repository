import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       /* Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota 1");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a nota 1");
        float n2 = teclado.nextFloat();
        teclado.close();
        float m = (n1+n2)/2;
        if  (m >= 7) {
            System.out.println("EXCELENTE!");
        }
        System.out.printf("Sua média foi " + m ); */



        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a idade:");
        int idade = teclado.nextInt();
        teclado.close();
        if (idade >= 18) {
            System.out.println("Maior de idade");
        }
            else {
                System.out.println("Menor de idade");
            }*/

        
        
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de ''a'':");
        int a = teclado.nextInt();
        System.out.println("Digite o valor de ''b'':");
        int b = teclado.nextInt();
        System.out.println("Digite o valor de ''c'':");
        int c = teclado.nextInt();
        teclado.close();
        int delta = (int) Math.pow(b, 2) -4 * a * c;
        if (delta<0) {
            System.out.println("Não há raízes reais");
        }
            else {
                System.out.println("Existem duas raízes reais");
            }*/




        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a idade do eleitor");
        int idade = teclado.nextInt();
        teclado.close();
        if (idade < 16) {
            System.out.println("Não vota");
        }
            else if ((idade >= 16 && idade < 18) || (idade > 70)) {
                    System.out.println("Voto Opcional");
                }
                else {
                    System.out.println("Voto obrigatório");
                }*/


        

        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de pernas do organismo:");
        int pernas = teclado.nextInt();
        teclado.close();
        String tipo;
        switch (pernas) {
            case 1:
                tipo = "Saci";
                break;
            case 2: 
                tipo = "Bípede";
                break;
            case 4: 
                tipo = "Quadrúpede";
                break;
            case 6, 8:
                tipo = "Aracnídeo";
                break;
            default:
                tipo ="ET";
        }
        System.out.println("Organismo do Tipo: " + tipo);*/




        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o tamanho do lado A:");
        int a = teclado.nextInt();
        System.out.println("Digite o tamanho do lado B:");
        int b = teclado.nextInt();
        System.out.println("Digite o tamanho do lado C:");
        int c = teclado.nextInt();
        teclado.close();
        if ((a<b+c) && (b<a+c) && (c<a+b)) {
            System.out.println("Esses três segmentos de reta formam um triângulo");
        }
            else {
                System.out.println("Esses três segmentos de reta NÃO formam um triângulo");
            }


    }
}
