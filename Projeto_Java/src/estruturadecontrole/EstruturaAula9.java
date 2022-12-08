package estruturadecontrole;

import java.util.Scanner;

/* Escreva um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.
BEECROWD 1143
 */
public class EstruturaAula9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();

        for (int num =1; num <= N; num++){
            System.out.println(num + " "+ (num*num) + " "+ (num*num*num));
        }

        teclado.close();

    }
}

/*
fazendo sem o Scanner *public class EstruturaAula9 {

    public static void main(String[] args) {
        int N = 3; // vai mostrar a quantidade de vezes realizado aqui

        for (int num =1; num <= N; num++){
            System.out.println(num + " "+ (num*num) + " "+ (num*num*num));
        }
    }
}
*/

