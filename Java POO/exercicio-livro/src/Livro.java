public class Livro implements Controlador {
    /**Atributos */
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    /**Métodos */
    public String detalhes() {
        return "Livro [aberto=" + aberto + ",\n autor=" + autor + ",\n leitor=" + leitor.getNome() + ",\n pagAtual=" + pagAtual
                + ",\n titulo=" + titulo + ",\n totPaginas=" + totPaginas + "]";
    }

    /**Constructor */
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
         this.titulo = titulo;
         this.autor = autor;
         this.totPaginas = totPaginas;
         this.aberto = false;
         this.pagAtual = 0;
         this.leitor = leitor;
    }
    

    /**Setters, Getters */
    /**
     * @return String return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return String return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return int return the totPaginas
     */
    public int getTotPaginas() {
        return totPaginas;
    }

    /**
     * @param totPaginas the totPaginas to set
     */
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    /**
     * @return int return the pagAtual
     */
    public int getPagAtual() {
        return pagAtual;
    }

    /**
     * @param pagAtual the pagAtual to set
     */
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    /**
     * @return boolean return the aberto
     */
    public boolean isAberto() {
        return aberto;
    }

    /**
     * @param aberto the aberto to set
     */
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    /**
     * @return Pessoa return the leitor
     */
    public Pessoa getLeitor() {
        return leitor;
    }

    /**
     * @param leitor the leitor to set
     */
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    /**Métodos Interface */
    @Override
    public void abrir() {
        setAberto(true);
    }

    @Override
    public void fechar() {
        setAberto(false);
    }

    @Override
    public void folhear(int p) {
        setPagAtual(p);
    }

    @Override
    public void avançarPag() {
        this.setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(getPagAtual() - 1);
    }

}
