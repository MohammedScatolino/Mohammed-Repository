public class Reptil extends Animal {

    private String corDeEscamama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
       System.out.println("Comendo Vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }
    
    

    /**
     * @return String return the corDeEscamama
     */
    public String getCorDeEscamama() {
        return corDeEscamama;
    }

    /**
     * @param corDeEscamama the corDeEscamama to set
     */
    public void setCorDeEscamama(String corDeEscamama) {
        this.corDeEscamama = corDeEscamama;
    }

}
