import java.util.Scanner;

public class Saldo {
    Scanner scan = new Scanner(System.in);
    private double saldo;
    private  int menu;

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    void menu () {
        do {
            System.out.println("== SALDO ==");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Adicionar saldo");
            System.out.println("3 - Voltar");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("Seu saldo atual e de R$" + getSaldo());
                    break;
                case 2:
                    incluirSaldo();
                    break;
                case 3:
                    break;
            }
        } while (menu != 3);
    }
    void incluirSaldo() {
        System.out.println("Atualmente voce possui R$" + getSaldo() + ". Digite o valor a ser adicionado.");
        double incluirSaldo = scan.nextInt();
        setSaldo(incluirSaldo+= saldo);
        System.out.println();
        System.out.println("Saldo atualizado para => R$" + getSaldo());
    }

    public void setNovoSaldo (double saldoAtualizado) {
        this.saldo = saldoAtualizado;
    }
}
