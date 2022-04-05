public class Lutador {

    //Constructor*
    public Lutador (String no, String na, int id, int vi, int em, int de, float pe, float al){
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setVitorias(vi);
        setEmpates(em);
        setDerrotas(de);
        setPeso(pe);
        setAltura(al);
    }

    //Atributos*
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, empates, derrotas;
    private float altura, peso;

    //Métodos**
    public void apresentar() {
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Empates: " + getEmpates());
        System.out.println("Derrotas: " + getDerrotas());
    }

    public void status() {
        System.out.print(getNome());
        System.out.print(" é um " + getCategoria() + " ");
        System.out.print(getVitorias() + " vitórias ");
        System.out.print(getDerrotas() + " derrotas ");
        System.out.print(getEmpates() + " empates ");
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    //Setter, Getters*
    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String no) {
        this.nome = no;
    }

    /**
     * @return String return the nacionalidade
     */
    public String getNacionalidade() {
        return nacionalidade;
    }

    /**
     * @param nacionalidade the nacionalidade to set
     */
    public void setNacionalidade(String na) {
        this.nacionalidade = na;
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int id) {
        this.idade = id;
    }

    /**
     * @return float return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float al) {
        this.altura = al;
    }

    /**
     * @return float return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float pe) {
        this.peso = pe;
        this.setCategoria();
    }

    /**
     * @return String return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = ("Inválido");
        } else if (this.peso <= 70.3) {
            this.categoria = ("Peso Leve");
        } else if (this.peso <= 83.9){
            this.categoria = ("Peso Médio");
        } else if (this.peso <= 120.2){
            this.categoria = ("Peso Pesado");
        } else if (this.peso > 120.2) {
            this.categoria = ("Inválido");
        }
    }

    /**
     * @return int return the vitorias
     */
    public int getVitorias() {
        return vitorias;
    }

    /**
     * @param vitorias the vitorias to set
     */
    public void setVitorias(int vi) {
        this.vitorias = vi;
    }

    /**
     * @return int return the empates
     */
    public int getEmpates() {
        return empates;
    }

    /**
     * @param empates the empates to set
     */
    public void setEmpates(int em) {
        this.empates = em;
    }

    /**
     * @return int return the derrotas
     */
    public int getDerrotas() {
        return derrotas;
    }

    /**
     * @param derrotas the derrotas to set
     */
    public void setDerrotas(int de) {
        this.derrotas = de;
    }

}
