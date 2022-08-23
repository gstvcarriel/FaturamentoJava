import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Pedido {
    Scanner input = new Scanner(System.in);
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String nomeProduto, concluir, formaPagamento;

    boolean verificaSaldo = true;
    int condPagto;
    double precoUnItem, vlTotal, saldoAtual;
    int qtdItem;

        void realizarPedido(double saldoTotal) {
            System.out.print("Insira o nome do produto: ");
            nomeProduto = input.next();

            System.out.print("Digite o pre�o unit�rio do produto '" + nomeProduto + "': ");
            precoUnItem = input.nextDouble();

            System.out.print("Digite a quantidade do produto '" + nomeProduto + "': ");
            qtdItem = input.nextInt();

            vlTotal = qtdItem * precoUnItem;

            System.out.print("Qual a forma de pagamento? ");
            System.out.println("1 - Dinheiro, 2 - Cart�o, 3 - Pix");
            condPagto = input.nextInt();

        switch (condPagto) {
            case 1 -> formaPagamento = ("Dinheiro");
            case 2 -> formaPagamento = ("Cart�o");
            case 3 -> formaPagamento = ("Pix");
        }

        System.out.println("******Resumo da compra******");
        System.out.println("============================");
        System.out.println("Produto: " + nomeProduto.toUpperCase());
        System.out.println("Pre�o unit�rio: R$ " + precoUnItem);
        System.out.println("Quantidade: " + qtdItem + "x");
        System.out.println("Forma de pagamento: " + formaPagamento.toUpperCase());
        System.out.println("Valor total: R$" + vlTotal);
        System.out.println("============================");

        /*Verifica se possui saldo*/
        if (vlTotal < saldoTotal || vlTotal == saldoTotal) {
            verificaSaldo = true;
        } else if (vlTotal > saldoTotal) {
            System.out.println("Valor do pedido ultrapassa o saldo em dispon�vel. Compra n�o permitida. Saldo atual dispon�vel: R$" + saldoTotal);
            verificaSaldo = false;
        }

        if (verificaSaldo == true) {
            System.out.println("Deseja finalizar a compra? Digite 'S' para concluir ou 'N' para cancelar a compra.");
            concluir = input.next();

            if (concluir.equalsIgnoreCase("S")) {
                System.out.println("Compra concluida com sucesso!");
                System.out.println();
                System.out.println("-------------------------------------");
                System.out.println("    CONFERENCIA DE CONTA");
                System.out.println("-------------------------------------");
                System.out.println("Data: " + dtf.format(LocalDateTime.now()));
                System.out.println("Produtos: " + qtdItem + "x " + nomeProduto.toUpperCase());
                System.out.println("Pre�o unit�rio: R$ " + precoUnItem);
                System.out.println("Forma de pagamento: " + formaPagamento.toUpperCase());
                System.out.println("Valor total: R$" + vlTotal);
                System.out.println();
                saldoAtual = saldoTotal - vlTotal;
                System.out.println("Novo saldo ap�s a compra: R$" + saldoAtual);

                System.out.println();

            } else if (concluir.equalsIgnoreCase("N")) {
                System.out.println("Compra cancelada.");
            } else {
                System.out.println("Op��o invalida.");
            }
        }
        }
    }