package exercicios.aula15out;

import java.util.Scanner;

public class Hora {

	/*exercicio 2 IF - ELSE - ELSE IF: escrever uma classe com atributo hora,
	criar um metodo chamado imformePeriodo,
	 caso a hora esteja entre 0 e 5 : madrugada,
	 caso seja maior que 5 e menor que 12 é de manha,
	 caso seja maior ou igual a 12 e menor que 18 escreva tarde ,
	 caso contrario */


    // metodo
    void verificaPeriodo(int hora) {

        if( hora >= 0 && hora <= 5) {
            System.out.println("\n madrugada");

        }else if (hora > 5 && hora < 12) {
            System.out.println("\n manhã ");

        }else if (hora >= 12 && hora < 18) {
            System.out.println("\n tarde ");

        }else {
            System.out.println("\n noite ");
        }
    }

    // classe main
    public static void main(String[] args) {

        Hora hora = new Hora();
        hora.verificaPeriodo(3); // (inclua o valor aqui para testar o metodo)





    }

}