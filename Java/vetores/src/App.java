import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
       /*int n[] = {6,3,2,9,8};
        for (int c = 0; c<=5; c++){
            System.out.println(n[c]);*/



            /*String mes[] = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
            int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            for (int c = 1; c<12; c++){
                System.out.println(mes[c] + " tem " + dias[c] + " dias");
            }*/



            /*int numero [] = {4,2,8,8,10};
            Arrays.sort(numero);
            for (int valor:numero) {
                System.out.println(valor);
            }*/



            int vetor[] = new int[20];
            Arrays.fill(vetor, 8);

            for (int c = 1; c<vetor.length; c++) {
                System.out.println(vetor[c]);
            }
        }


}
