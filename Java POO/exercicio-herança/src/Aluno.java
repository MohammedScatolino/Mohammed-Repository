public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    public void cancelarMatricula() {
        System.out.println("Matrícula cancelada");
    }

    public void pagarMensalidade() {
        System.out.println("Mensalidade paga de " + this.nome);
    }



    /**
     * @return int return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return String return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

}
