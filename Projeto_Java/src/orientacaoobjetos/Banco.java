package orientacaoobjetos;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        double valor;
        ContaBancaria conta = new ContaBancaria(1001, 2, "Estefania", "123.456.789-00", 500.00);

        do {
            System.out.println("IsiBank - Seu banco na Internet");
            System.out.println("Digite 1-Deposito/ 2-Saque/ 3-Info/ 0-Sair");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(">>>>Deposito - Digite o valor: ");
                    valor = teclado.nextDouble();
                    conta.depositar(valor);
                    break;
                case 2:
                    System.out.println(">>>> Saque - Digite o valor: ");
                    valor = teclado.nextDouble();
                    if (conta.sacar(valor)) {
                        System.out.println("  Saque efetuado!");
                    } else {
                        System.out.println("   Saldo insuficiente!");
                    }
                    break;
                case 3:
                    System.out.println(" >>>> Info: " + conta.exibirDados());
                    break;
                case 0:
                    System.out.println(">>>> Obrigado pela preferencia - volte sempre!!!");
                    break;
                default:
                    System.out.println("Opcao Invalida ***");
                  }
            }
            while (opcao != 0) ;

            teclado.close();
        }
    }