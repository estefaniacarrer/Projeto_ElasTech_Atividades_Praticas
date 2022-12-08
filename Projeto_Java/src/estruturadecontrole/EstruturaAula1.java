package estruturadecontrole;

import java.util.Scanner;
public class EstruturaAula1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2, me;
        System.out.print("Digite a N1: ");
        n1 = teclado.nextDouble();
        System.out.print("Digite a N2: ");
        n2 = teclado.nextDouble();

        me = (n1 + n2) / 2;

        System.out.println("Sua media final vale: " + me);

        if (me >= 6) {
            System.out.println("Parabens voce foi aprovado!");
        } else {
            System.out.println("Voce foi reprovado!");
        }
        System.out.println("Fim do programa");



        teclado.close();
    }
}
