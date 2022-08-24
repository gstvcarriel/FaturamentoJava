import java.util.Scanner;

public class Saldo {
    Scanner input = new Scanner(System.in);
    double saldo;
    double adcSaldo;
    void setSaldoInicial () {
        System.out.print("Digite o saldo inicial: ");
        saldo = input.nextDouble();
    }
    public double getSaldo () {
        return saldo;
    }
    void adicionarSaldo() {
        System.out.println("Digite a quantidade a ser depositada: ");
        adcSaldo = input.nextDouble();
        saldo += adcSaldo;
        System.out.println("Seu saldo atualizado e de R$" + saldo);
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
