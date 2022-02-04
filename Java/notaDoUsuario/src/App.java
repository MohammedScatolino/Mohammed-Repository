import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno(a): ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno(a): ");
        float nota = teclado.nextFloat();
        teclado.close();
        System.out.format("A nota de %s é %.1f \n", nome, nota);
        
    }
}
