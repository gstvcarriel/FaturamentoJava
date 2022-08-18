import java.util.Scanner;

public class Faturamento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        calcFaturamento calc = new calcFaturamento();

        calc.getNomeProduto();
        calc.getPrecoProduto();
        calc.getQtdProduto();
        calc.somaProdutos();
        calc.formaPagto();
        calc.resumoCompra();
        calc.encerrarCompra();
    }
}
