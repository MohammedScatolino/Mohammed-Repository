public class App {
    public static void main(String[] args) throws Exception {
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p2.setNome("o cara");
        System.out.println(p2.toString()); 
    }
}
