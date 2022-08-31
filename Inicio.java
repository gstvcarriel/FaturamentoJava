import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menuInicial;
        //
        Cliente cliente = new Cliente();
        Saldo saldo = new Saldo();
        Pedidos pedidos = new Pedidos();

        //CADASTRO CLIENTE E SALDO INCIAL
        System.out.print("Bem vindo! Por favor, informe o seu nome: ");
        String nome = scan.nextLine();
        cliente.setNome(nome);

        System.out.print(cliente.getNome() + ", digite seu saldo inicial. R$ ");
        double saldoInicial = scan.nextDouble();
        saldo.setSaldo(saldoInicial);
        System.out.println();
        //========================

        System.out.println(cliente.getNome() + ", seu saldo e de R$ " + saldo.getSaldo() + " reais.");
        System.out.println();

        do {
            System.out.println("== MENU ==");
            System.out.println("1 - Pedidos");
            System.out.println("2 - Saldo");
            System.out.println("3 - Sair");
            menuInicial = scan.nextInt();

            switch (menuInicial) {
                case 1:
                    pedidos.menu(saldo.getSaldo());
                    saldo.setSaldo(pedidos.getSaldoAtualizado());
                    break;
                case 2:
                    saldo.menu();
                    break;
                case 3:
                    System.out.println("Até logo.");
                    break;
                default:
                    System.out.println("Opcao invalida. Digite novamente");
            }
        } while (menuInicial != 3) ;
    }
}

