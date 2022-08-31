import java.util.Scanner;

public class Pedidos {
    Scanner scan = new Scanner(System.in);
    private String nome, formaPagto;
    private double valorUn, quantidade, valorPedido, saldoAtualizado;
    private int opcPagto;
    private int menu;

    void menu (double saldo) {
        do {
            System.out.println("== PEDIDO ==");
            System.out.println("1 - Novo pedido");
            System.out.println("2 - Voltar");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("== NOVO PEDIDO ==");
                    System.out.print("Digite o nome do produto: ");
                    nome = scan.next();
                    System.out.print("Digite o valor unitario do produto: R$ ");
                    valorUn = scan.nextDouble();
                    System.out.print("Digite a quantidade: ");
                    quantidade = scan.nextDouble();
                    System.out.println();

                    System.out.println("Escolha uma forma de pagamento");
                    System.out.println("1 - Dinheiro");
                    System.out.println("2 - Cartao");
                    System.out.println("3 - PIX");
                    opcPagto = scan.nextInt();

                    switch (opcPagto) {
                        case 1:
                            formaPagto = ("Dinheiro");
                            break;
                        case 2:
                            formaPagto = ("Cartao");
                            break;
                        case 3:
                            formaPagto = ("PIX");
                            break;
                        default:
                            System.out.println("Opcao invalida.");
                            return;
                    }

                    System.out.println();
                    System.out.println("*** RESUMO DA COMPRA ***");
                    System.out.println("Produto: " + nome);
                    System.out.println("Valor unitario: R$" + valorUn);
                    System.out.println("Quantidade: " + quantidade + "x");
                    System.out.println("Forma de pagamento: " + formaPagto);
                    valorPedido = valorUn * quantidade;
                    System.out.println("O valor total do pedido e: R$" + valorPedido + " reais.");
                    System.out.println();

                    System.out.println("          Deseja prosseguir?");
                    System.out.println("1 - Continuar      2 - Cancelar");
                    System.out.println();
                    int continuar = scan.nextInt();

                    switch (continuar) {
                        case 1:
                            break;
                        case 2:
                            System.out.println("Pedido cancelado.");
                            break;
                        default:
                            System.out.println("Opcao invalida");
                            break;
                    }

                    System.out.println("== RESUMO DA COMPRA ==");
                    System.out.println("Produto: " + nome + quantidade + "x" + " (Vl. unitario: R$" + valorUn + ")");
                    System.out.println("Forma de pagamento: " + formaPagto);
                    System.out.println("Valor total: R$ " + valorPedido + " reais.");

                    if (saldo >= valorPedido) {
                        saldoAtualizado = saldo - valorPedido;
                        System.out.println("Pedido realizado com sucesso! Agradecemos a preferencia!");
                        System.out.println("Saldo atualizado para R$" + saldoAtualizado);
                    } else if (saldo <= valorPedido) {
                        System.out.println("Voce nao possui saldo insuficiente." + "O valor do pedido foi de R$ "+ valorPedido +
                                "reais, porem voce tem apenas R$ " + saldo + " reais em saldo. \n");
                        System.out.println("O pedido será cancelado.");
                    }
                    break;
                case 2:
                    System.out.println("Voltando para o menu inicial...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (menu != 2);
    }
    public double getSaldoAtualizado() {
        return saldoAtualizado;
    }
}
