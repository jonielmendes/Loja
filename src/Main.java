import Classes.Data;
import Classes.Empregado;
import Classes.Fatura;
import Classes.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        Fatura fatura = new Fatura("123", "Fatura de teste", 10, 10.0);
        System.out.println("Número: " + fatura.getNumero());
        System.out.println("Descrição: " + fatura.getDescricao());
        System.out.println("Quantidade: " + fatura.getQuantidade());
        System.out.println("Preço: " + fatura.getPreco());
        System.out.println("Valor da fatura: " + fatura.getValorFatura());

        System.out.println("--------");

        Empregado empregado1 = new Empregado("João", "Silva", 3000.0);
        Empregado empregado2 = new Empregado("Maria", "Oliveira", 4000.0);

        System.out.println("Salários anuais antes do aumento:");
        empregado1.salarioAnual();
        empregado2.salarioAnual();

        empregado1.aumentarSalario(10);
        empregado2.aumentarSalario(10);

        System.out.println("Salários anuais após o aumento de 10%:");
        empregado1.salarioAnual();
        empregado2.salarioAnual();

        System.out.println("--------");

        Data data = new Data(15, 8, 2023);
        data.displayData();

        data.setDia(20);
        data.setMes(12);
        data.setAno(2024);
        data.displayData();

        System.out.println("--------");

        ContaCorrente conta = new ContaCorrente("12345", 1000.0, true, 500.0);

        System.out.println("Saldo inicial: " + conta.consultarSaldo());

        conta.depositarDinheiro(200.0);
        System.out.println("Saldo após depósito: " + conta.consultarSaldo());

        boolean saqueRealizado = conta.realizarSaque(1500.0);
        System.out.println("Saque de 1500 realizado: " + saqueRealizado);
        System.out.println("Saldo após saque: " + conta.consultarSaldo());

        System.out.println("Usando cheque especial: " + conta.usandoChequeEspecial());
    }
}