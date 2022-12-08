package estruturadecontrole;

import java.util.Scanner;

public class EstruturaAula62 {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            int numero = teclado.nextInt();
            int contador;

            contador = 1;
            do{
               System.out.println(numero + " x " + contador + " = " + (numero * contador));
               contador++;
        }while (contador <=10);
            teclado.close();

    }

}
