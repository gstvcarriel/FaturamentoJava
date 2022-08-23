import java.util.Scanner;
  public class Cliente {
    Scanner input = new Scanner(System.in);
    String nomeCliente;
    double saldo;
    double adcSaldo;

    void setNome () {
        System.out.println("Digite seu nome: ");
        nomeCliente = input.next();
    }
    public String getNome (){
        return nomeCliente;
    }
    void setSaldoInicial () {
        System.out.println("Digite o saldo inicial: ");
        saldo = input.nextDouble();
    }
      public double getSaldo (){
          return saldo;
      }
        void adicionarSaldo() {
            System.out.println("Digite a quantidade a ser depositada: ");
             adcSaldo = input.nextDouble();
             saldo += adcSaldo;
            System.out.println("Seu saldo atualizado é de R$" + saldo);
        }
  }
