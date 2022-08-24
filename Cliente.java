import java.util.Scanner;
  public class Cliente {
    Scanner input = new Scanner(System.in);
    String nomeCliente;

    void setNome () {
        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = input.next();
    }
    public String getNome () {
        return nomeCliente;
    }
  }
