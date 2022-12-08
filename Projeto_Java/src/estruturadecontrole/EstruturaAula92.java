package estruturadecontrole;
/*
BEECROWD 1115
Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano.
 Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas
  coordenadas for NULA (nesta situação sem escrever mensagem alguma).

 x!= =          y!=0       RES
 V                V         V
 V                F         F
 F                V         F
 F                F         F

 */

import java.util.Scanner;

public class EstruturaAula92 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x, y;

        do {
            x = teclado.nextInt();
            y = teclado.nextInt();

            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            } else if (x > 0 && y < 0) {
                System.out.println("quarto");
            }
            if (x == 0 || y == 0){
                break;
            }
        }while(true);             //(x!=0 && y!=0);

        teclado.close();
    }
}
