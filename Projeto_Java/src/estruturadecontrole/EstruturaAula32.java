package estruturadecontrole;

import java.util.Scanner;

public class EstruturaAula32 {

        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            double n1, n2, me;

            System.out.print("Digite a N1: ");
            n1 = teclado.nextDouble();
            System.out.print("Digite a N2: ");
            n2 = teclado.nextDouble();

            me = (n1 + n2) / 2;

            System.out.println("Sua media final vale: " + me);

            if (me >= 9.0) {
                System.out.println("Conceito A");
            } else if (me >= 8 && me < 9) {
                System.out.println("Conceito B");
            }
            else if (me >= 7 && me < 8){
                System.out.println("Conceito C");
            }
            else if (me >= 6 && me < 7){
                System.out.println("Conceito D");
            }
            else{
                System.out.println("Conceito E");
            }

            teclado.close();
        }
    }


