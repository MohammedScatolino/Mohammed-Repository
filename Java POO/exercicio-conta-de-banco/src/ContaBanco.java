public class ContaBanco {
    public int numeroConta;
    private float saldo;
    protected String tipoConta; 
    private String dono;
    private boolean status;

    
    public ContaBanco (String tc, String d) {
        numeroConta = 1;
        dono = d;
        saldo = 0;
        status = false;     
        pagarMensalidade();
    }


    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float sa) {
        this.saldo = sa;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int nc) {
        this.numeroConta = nc;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tc) {
        this.tipoConta = tc;
    }

    public void abrirConta(String tc) {
        this.setStatus(true);
        this.setTipoConta(tc);
        if (tc == "cc")
            this.setSaldo(50);
        else if (tc == "cp")
            this.setSaldo(150);
    } 

    public void fecharConta() {
        if (saldo == 0) {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso");
        }
        else {
            System.out.println("Conta impossível de ser fechada, possui saldo ou débito");
        }
    } 

    public void sacar(float saque) {
        if (getStatus()) {
            if (getSaldo() >= saque) {
                setSaldo(getSaldo() - saque);
                System.out.println("Saque realizado");
            }
            else { 
                System.out.println("Saldo Insuficiente");
            }
        }
        else {
            System.out.println("Conta Inativa");
        }
    }

    public void depositar(float deposito) {
        if (status = true) {
            setSaldo(getSaldo() + deposito);
            System.out.println("Depósito realizado");
        }
        else {
            System.out.println("Conta Inativa");
        }
    }

    public void pagarMensalidade() {
        if (getStatus())
            if (getTipoConta() == "cc")
                setSaldo(getSaldo() - 12);
            else
                if (getTipoConta() == "cp")
                setSaldo(getSaldo() - 20);
                else 
                    System.out.println("ERRO! Tipo de Conta não identificado");
    }
    
    public void extrato() {
        System.out.println("Número da Conta " + this.numeroConta);
        System.out.println("Tipo da Conta " + this.tipoConta);
        System.out.println("Dono " + this.dono);
        System.out.println("Saldo " + this.saldo);
        System.out.println("Aberta: " + this.status);
    }













}
