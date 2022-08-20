import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Pedido extends Cliente {
    Scanner input = new Scanner(System.in);

    Cliente cliente = new Cliente();
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    String nomeProduto, concluir, formaPagamento;

    boolean verificaSaldo = true;
    int condPagto;
    double precoUnItem, vlTotal;
    int qtdItem;

        void realizarPedido() {
        System.out.print("Insira o nome do produto: ");
        nomeProduto = input.next();

        System.out.print("Digite o preço unitário do produto '" + nomeProduto + "': ");
        precoUnItem = input.nextDouble();

        System.out.print("Digite a quantidade do produto '" + nomeProduto + "': ");
        qtdItem = input.nextInt();

        vlTotal = qtdItem * precoUnItem;
        System.out.println("O valor total da compra é: R$ " + vlTotal);

        System.out.print("Qual a forma de pagamento? ");
        System.out.println("1 - Dinheiro, 2 - Cartão, 3 - Pix");
        condPagto = input.nextInt();

        switch (condPagto) {
            case 1 -> formaPagamento = ("Dinheiro");
            case 2 -> formaPagamento = ("Cartão");
            case 3 -> formaPagamento = ("Pix");
        }

        System.out.println("******Resumo da compra******");
        System.out.println("============================");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço unitário: R$ " + precoUnItem);
        System.out.println("Quantidade: " + qtdItem);
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println("Valor total: R$" + vlTotal);
        System.out.println("============================");

        /*Verifica se possui saldo*/
        if (vlTotal < cliente.saldoCliente || vlTotal == cliente.saldoCliente) {
            verificaSaldo = true;
        } else if (vlTotal > cliente.saldoCliente) {
            System.out.println("Valor do pedido ultrapassa o saldo em disponível. Compra não permitida. Saldo disponível R$" + cliente.saldoCliente);
            verificaSaldo = false;
        }

        if (verificaSaldo = true) {
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
                System.out.println("Preço unitário: R$ " + precoUnItem);
                System.out.println("Forma de pagamento: " + formaPagamento.toUpperCase());
                System.out.println("Valor total: R$" + vlTotal);
                System.out.println();

            } else if (concluir.equalsIgnoreCase("N")) {
                System.out.println("Compra cancelada.");
            } else {
                System.out.println("Opção invalida.");
            }
        }
    }
}