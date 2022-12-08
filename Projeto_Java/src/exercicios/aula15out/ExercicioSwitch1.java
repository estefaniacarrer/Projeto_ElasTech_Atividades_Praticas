package exercicios.aula15out;


/*
Escrever uma classe, com um atributo int chamado "mes". Criar um mÃ©todo chamado
"escreverMesExtenso". Caso o "mes" seja igual a 1, escrever atravÃ©s de
System.out.println a String "Janeiro".  Caso o "mes" seja igual a 2, escrever a
String "Fevereiro", e assim por diante. Modificar o valor de "mes" para testar
vÃ¡rias possibilidades
 */


import java.sql.SQLOutput;

public class ExercicioSwitch1 {



    public static void main(String[] args) {
        ExercicioSwitch1 ex1 = new ExercicioSwitch1();
        ex1.escreverMesExtenso();
    }

    public void escreverMesExtenso() {

        int mes = 8;

        switch (mes) {
            case 1:
               System.out.println("Janeiro");
               break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Não corresponde a nenhum mês");
                break;

        }
    }

}
