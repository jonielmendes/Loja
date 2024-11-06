package Classes;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        validarValores();
    }

    public String getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public double getValorFatura() {
        return quantidade * preco;
    }

    private void validarValores() {
        if (quantidade < 0) {
            quantidade = 0;
        }
        if (preco < 0) {
            preco = 0.0;
        }
    }
}