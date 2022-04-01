
public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;
    private boolean tampada;

    public Caneta(String m, String c) {
        setModelo(m);
        setCor(c);
        setPonta(0.7f);
        tampar();
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String c) {
        this.cor = c;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status() {
        System.out.println("Modelo = " + this.modelo); 
        System.out.println("Cor = " + this.cor);    
        System.out.println("Ponta = " + this.ponta);
        System.out.println("Tampada = " + this.tampada);
    }
}