package Classes;

public class ContaCorrente {
    private String numero;
    private double saldo;
    private boolean statusEspecial;
    private double limite;

    public ContaCorrente(String numero, double saldo, boolean statusEspecial, double limite) {
        this.numero = numero;
        this.saldo = saldo;
        this.statusEspecial = statusEspecial;
        this.limite = limite;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatusEspecial() {
        return statusEspecial;
    }

    public double getLimite() {
        return limite;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatusEspecial(boolean statusEspecial) {
        this.statusEspecial = statusEspecial;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean realizarSaque(double valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void depositarDinheiro(double valor) {
        saldo += valor;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public boolean usandoChequeEspecial() {
        return saldo < 0;
    }
}