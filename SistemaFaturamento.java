import java.util.Scanner;

public class SistemaFaturamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        cadastroCliente cliente = new cadastroCliente();
        calcFaturamento calc = new calcFaturamento();

        int menuNav;

        /*Cadastro cliente e saldo*/
        System.out.println("Por favor, digite o seu nome abaixo: ");
        cliente.nomeCliente = input.next();
        System.out.println("Digite seu saldo inicial: ");
        cliente.saldoCliente = input.nextDouble();


        /*Apresenta��o + saldo + escolha de a��o*/
        System.out.println("Bem vindo, " + cliente.nomeCliente + "! Seu saldo � de R$ " + cliente.saldoCliente + " reais.");

            System.out.println("O que deseja fazer?");
            System.out.println("1 - Realizar pedido");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Adicionar saldo");
            System.out.println("4 - Sair");
            menuNav = input.nextInt();
            switch (menuNav) {
                case 1 -> calc.realizarPedido();
                case 2 -> System.out.println("Seu saldo atual � de R$" + cliente.saldoCliente);
                case 3 -> cliente.adicionarSaldo();
                case 4 -> System.out.println("At� breve.");
            }
        }
    }
