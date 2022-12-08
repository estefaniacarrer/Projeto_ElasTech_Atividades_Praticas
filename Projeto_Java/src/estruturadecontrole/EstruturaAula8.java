package estruturadecontrole;

public class EstruturaAula8 {
    public static void main(String[] args) {

        for (int contador =1; ; contador++){

            if (contador == 5){
                break; // se for usado o "continue" ela irá contar até 10
            }
            System.out.println("contador= " +contador);

        }

        System.out.println("Fim do programa");
    }
}

/*posso também fazer assim:

int contador = 1;
while (true) {
if (contador == 5){
break;
}System.out.println("Contador = " +contador);
contador++;
}
System.out.println("Fim do programa");
 */
