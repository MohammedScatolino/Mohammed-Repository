public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

        public void mudaTrabalhando() {
            setTrabalhando(! this.trabalhando);
        }
    
    /**
     * @return String return the setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }

    /**
     * @return boolean return the trabalhando
     */
    public boolean isTrabalhando() {
        return trabalhando;
    }

    /**
     * @param trabalhando the trabalhando to set
     */
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
