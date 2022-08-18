import java.util.Scanner;

public class calcFaturamento {
    Scanner input = new Scanner(System.in);
    String nomeProduto, concluir, formaPagamento;
    int condPagto;
    double precoUnItem, vlTotal;
    int qtdItem;


        void getNomeProduto () {
        System.out.print("Insira o nome do produto: ");
        nomeProduto = input.next();
    }

        void getPrecoProduto () {
        System.out.print("Digite o preço unitário do produto '" + nomeProduto + "': ");
        precoUnItem = input.nextDouble();
    }
        void getQtdProduto () {
        System.out.print("Digite a quantidade do produto '" + nomeProduto + "': ");
        qtdItem = input.nextInt();
    }
        void somaProdutos () {
        vlTotal = qtdItem * precoUnItem;
        System.out.println("O valor total da compra é: R$ " + vlTotal);
    }
        void formaPagto () {
        System.out.print("Qual a forma de pagamento? ");
        System.out.println("1 - A vista, 2 - Cartão, 3 - Pix");
        condPagto = input.nextInt();

        switch (condPagto) {
            case 1 -> formaPagamento = ("A Vista");
            case 2 -> formaPagamento = ("Cartão");
            case 3 -> formaPagamento = ("Pix");
        }
    }
        void resumoCompra () {
        System.out.println("******Resumo da compra******");
        System.out.println("============================");
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Preço unitário: R$ " + precoUnItem);
        System.out.println("Quantidade: " + qtdItem);
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println("Valor total: R$" + vlTotal);
        System.out.println("============================");
    }

        void encerrarCompra () {
        System.out.println("Deseja finalizar a compra? Digite 'S' para concluir ou 'N' para cancelar a compra.");
        concluir = input.next();
        if (concluir.equalsIgnoreCase("S")) {
            System.out.println("Compra concluida! Agradecemos a preferência! :)");
        } else if (concluir.equalsIgnoreCase("N")) {
            System.out.println("Compra cancelada. Deseja inserir os dados novamente?");
        } else {
            System.out.println("Opção invalida.");
        }
    }
}
