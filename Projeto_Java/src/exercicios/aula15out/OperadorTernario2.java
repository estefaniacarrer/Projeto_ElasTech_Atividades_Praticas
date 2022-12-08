package exercicios.aula15out;

public class OperadorTernario2 {


    public void informaValorImposto () {

        int salario = 6000;

        int resultado = (salario > 5000) ? 15 : (salario < 5000) ? 5 : 5;
        //o operador ternario serve como um IF ELSE para pequenos testes de um 2 ou 3 dados ( não é mt recomandado no dia a dia)

        System.out.println(resultado);

    }

    public static void main(String[] args) {
        OperadorTernario2 salario = new OperadorTernario2();
        OperadorTernario2 resultado = new OperadorTernario2();

      salario.informaValorImposto();

    }
}
