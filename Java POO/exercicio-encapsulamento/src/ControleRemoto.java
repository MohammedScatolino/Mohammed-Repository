public class ControleRemoto implements Controlador {

    //Atributos*
        private int volume;
        private boolean ligado;
        private boolean tocando;

    //*Métodos*
        public ControleRemoto(){
            setVolume(50);
            setLigado(false);
            setTocando(false);
        }

    //Getter, setters*
    public int getVolume() {
        return volume;
    }
    public void setVolume(int v) {
        this.volume = v;
    }


    public boolean isLigado() {
        return ligado;
    }
    public void setLigado(boolean l) {
        this.ligado = l;
    }


    public boolean isTocando() {
        return tocando;
    }
    public void setTocando(boolean t) {
        this.tocando = t;
    }

    //Métodos Abstratos*
    public void ligar() {
        setLigado(true);
    }

    public void desligar() {
        setLigado(false);
    }

    public void abrirMenu() {
        System.out.println("---------MENU--------------");
        System.out.println("Está ligado ? " + isLigado());
        System.out.println("Está tocando ? " + isTocando());
        System.out.print("Volume: " + getVolume());
        for (int i = 0; i <= getVolume(); i+=10)
            System.out.print("|");
    }

    public void fecharMenu() {
        System.out.println("Fechando Menu...");
    }

    public void maisVolume() {
        if (isLigado()) {
            setVolume(this.getVolume() + 5);
        }
    }

    public void menosVolume() {
        if (isLigado()) {
            setVolume(this.getVolume() - 5);
        }
    }

    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            setVolume(0);
        }
    }

    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0 ) {
            setVolume(50);
        }
    }

    public void play() {
        if (this.isLigado() && !(this.isTocando())){
            setTocando(true);
        }
    }

    public void pause() {
        if (this.isLigado() && this.isLigado()) {
            setTocando(false);
        }
    }




}
