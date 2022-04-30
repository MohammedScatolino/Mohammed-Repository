public class Ave extends Animal {

    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public void fazerNinho() {
        System.out.println("Fazendo Ninho");
    }

    /**
     * @return String return the corPena
     */
    public String getCorPena() {
        return corPena;
    }

    /**
     * @param corPena the corPena to set
     */
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
