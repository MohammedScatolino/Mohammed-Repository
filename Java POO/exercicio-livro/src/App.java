public class App {
    public static void main(String[] args) throws Exception {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro", "M", 25);
        p[1] = new Pessoa("Maria", "F", 22);

        l[0] = new Livro("Java", "José da Silva", 300, p[0]);
        l[1] = new Livro("POO", "Pedro Paulo", 500, p[1]);
        l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);

        l[0].abrir();
        l[0].folhear(200);

        System.out.println(l[0].detalhes());
        
    }
}
