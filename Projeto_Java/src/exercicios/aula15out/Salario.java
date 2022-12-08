/*Escrever uma classe, com um atributo int chamado "salario". Criar um método chamado "informaValorImposto".
Caso o salario seja maior que 5000, retornar 15. Caso contrário, retornar 5.
*/

package exercicios.aula15out;

public class Salario {
    //public int salario;

    public static int informaValorImposto (int salario){ // quando preciso retornar algo usar int, quando monstro um valor void ----
                                                            // Usar static quando não desejo criar um objeto dentro do maion
                if ( salario > 5000) {
                    return 15;
//                    System.out.println("15");
                } else {
                    return 5;
//                        System.out.println("5");
                    }

    }
    public static void main(String[] args) {
        int temp = informaValorImposto(10000);
        System.out.println(temp);

   /* public static void main(String[] args) {
        Salario s = new Salario();
        System.out.println(s.informaValorImposto(10000));*/

       // int temp = s.informaValorImposto(5000);

        //System.out.println(temp);

    }
}
