package estruturadecontrole;
// não rodou

import java.util.Scanner;

public class EstruturaAula12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double matriz [][];
        matriz = new double[3][5];

        for (int l = 0; l < 3; l++){
            for (int c = 0; c < 5; c++){
                System.out.println("Digite o valor da matriz[" +1+"]["+c+"]=");
                matriz[l][c] = teclado.nextDouble();

            }
        }

     // agora vou imprimir a matriz como de verdade

     for (int l = 0; l<3 ;l++){
         for(int c=0; c<5; c++){
             System.out.printf("%10.2f", matriz[l][c]);
         }
         System.out.println();
     }

        teclado.close();
    }
}
