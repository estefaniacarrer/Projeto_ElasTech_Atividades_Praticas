package exercicios.aula15out;

public class OperadorTernario {

    /*
     * Reescrever o exercicio 1 if-else com o operador ternario escrever uma classe,
     * com um atributo int chamado salario. criar um metodo chamado
     * informarValorImposto. caso salario seja maior que 5000 retornar 15. caso nao
     * retornar 5.
     */

    void informaValorImposto(int salario) {

        // variavel

        String resultado = (salario > 5000) ? "15": // teste 1 (IF) ? resultado teste 1
                (salario < 5000) ? "5": // teste 2 (ELSE IF OU ELSE) ? resultado teste 2
                        "5"; // default
    }

	/*
	 OUTRA FORMA DE ESCREVER:
	 int resultado = (salario > 5000) ? 15 : (salario < 5000) ? 5 : 5;
     o operador ternario serve como um IF ELSE para pequenos testes de um 2 ou 3 dados ( não é mt recomandado no dia a dia) */


    // classe main

    public static void main(String[] args) {

        OperadorTernario salario = new OperadorTernario();
        OperadorTernario resultado = new OperadorTernario();

        salario.informaValorImposto(6000); //(inclua o valor aqui para testar o metodo)

    }
}