package exercicios.aula15out;

public class ExercicioSwitch2 {

    public int mes;
    public void escreverMesExtenso (int mes) {

        // int mes = 8; ( posso apenas declarar o atributo aqui, tirando ele ali de cima "int mes" e "public int mes"

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Marco");
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
                System.out.println("Mes invalido");

        }
    }

    public static void main(String[] args) {
        ExercicioSwitch2 ex2 = new ExercicioSwitch2();
        ex2.escreverMesExtenso(2); // inserir o numero para testar o métedo

    }
}
