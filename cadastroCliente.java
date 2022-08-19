import java.util.Scanner;

public class cadastroCliente {
    calcFaturamento calc = new calcFaturamento();
    Scanner input = new Scanner(System.in);
    String nomeCliente;
   double saldoCliente;
   double adcSaldo;

        void adicionarSaldo() {
            System.out.println("Seu saldo atual é R$" + saldoCliente);

            System.out.println("Digite a quantidade a ser depositada: ");
             adcSaldo = input.nextDouble();
             saldoCliente = saldoCliente + adcSaldo;

            System.out.println("Seu saldo atualizado é de R$" + saldoCliente);
        }
}
