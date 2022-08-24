import java.util.Scanner;
public class SistemaFaturamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cliente cliente = new Cliente();
        Saldo saldo = new Saldo();
        Pedido pedido = new Pedido();

       int menuNav; 

        /*Cadastro cliente e saldo inicial*/
         cliente.setNome();
         saldo.setSaldoInicial();

        /*Apresentação + saldo*/
        System.out.println();
        System.out.println("Bem vindo, " + cliente.getNome() + "! Seu saldo atual e de R$ " + saldo.getSaldo() + " reais.");
        System.out.println();
        /*Menu*/
        do {
            System.out.println("+--------------------------+");
            System.out.println(" |                MENU                |");
            System.out.println("+--------------------------+");
            System.out.println(" |    1 - Realizar pedido       |");
            System.out.println(" |    2 - Adicionar Saldo      |");
            System.out.println(" |    3 - Consultar Saldo      |");
            System.out.println(" |    4 - Sair                           |");
            System.out.println("+--------------------------+");
            menuNav = input.nextInt();
            switch (menuNav) {
                case 1 :
                    pedido.realizarPedido(saldo.getSaldo());
                    break;
                case 2 :
                    saldo.setSaldo(pedido.getSaldoAtual());
                    System.out.println("Seu saldo atual e de R$" + saldo.getSaldo());
                    break;
                case 3 :
                    saldo.adicionarSaldo();
                    break;
                case 4 :
                        System.out.println("Ate breve.");
                        break;
                default :
                    System.out.println("Opçao invalida. Digite novamente.");
                    break;
            }
        } while(menuNav != 4);
    }
    }
