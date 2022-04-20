public final class Bolsista extends Aluno {

    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.nome);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + "é bolsista, pagamento facilitado");
    }


    /**
     * @return float return the bolsa
     */
    public float getBolsa() {
        return bolsa;
    }

    /**
     * @param bolsa the bolsa to set
     */
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
