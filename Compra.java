import java.util.Scanner;

public class Compra {

    Scanner input = new Scanner(System.in);
    Pedido pedido = new Pedido();

    int menuCompraNav;

    void menuCompra (double saldoTotal) {
        do {
        System.out.println("******COMPRAS******");
        System.out.println("");
        System.out.println("1 - Realizar pedido");
        System.out.println("2 - Compras realizadas");
        System.out.println("3 - Voltar");
        menuCompraNav = input.nextInt();

            switch (menuCompraNav) {
                case 1:
                    pedido.realizarPedido(saldoTotal);
                    break;
                case 2:
                    System.out.println("Funcao ainda nao disponivel.");
                    break;
                case 3:
                    break;
            }
        } while (menuCompraNav != 3);
    }
}
