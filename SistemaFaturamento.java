import java.util.Scanner;
public class SistemaFaturamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cliente cliente = new Cliente();
        Pedido pedido = new Pedido();

       int menuNav;

        /*Cadastro cliente e saldo inicial*/
         cliente.setNome();
         cliente.setSaldoInicial();

        /*Apresenta��o + saldo + escolha de a��o*/
        System.out.println();
        System.out.println("Bem vindo, " + cliente.getNome() + "! Seu saldo � de R$ " + cliente.getSaldo() + " reais.");
        System.out.println();

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Realizar pedido");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Adicionar saldo");
            System.out.println("4 - Sair");
            menuNav = input.nextInt();
            switch (menuNav) {
                case 1 :
                    pedido.realizarPedido(cliente.getSaldo());
                    break;
                case 2 :
                    System.out.println("Seu saldo atual � de R$" + cliente.getSaldo());
                    break;
                case 3 :
                    cliente.adicionarSaldo();
                    break;
                case 4 :
                        System.out.println("At� breve.");
                        break;
                default :
                    System.out.println("Op��o invalida. Digite novamente");
                    break;
            }
        } while(menuNav != 4);
    }
    }
