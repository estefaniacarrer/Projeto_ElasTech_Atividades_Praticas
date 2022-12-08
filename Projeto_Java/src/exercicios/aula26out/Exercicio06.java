package exercicios.aula26out;

/* Crie uma classe chamada MultiplosDeQuatro. Crie um método que imprima apenas os números múltiplos de 4
(aqueles que, quando divididos por 4, resultam em 0 no resto). até 100
 */

public class Exercicio06 {

    public void imprimir() {

        for (int i= 0; i <= 100; i++) {
            if ( i % 4 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Exercicio06 ex06 = new Exercicio06();
        ex06.imprimir();
    }
}

/* com while
int i=0;
    while(i < 100){
        if(i%4==0){
            System.out.println(i);
        }
        i++;
    }

 */
