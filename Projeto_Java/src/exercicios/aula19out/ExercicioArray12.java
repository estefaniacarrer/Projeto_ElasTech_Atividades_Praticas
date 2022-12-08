package exercicios.aula19out;


import java.util.Arrays;

public class ExercicioArray12 {

    public void listarNomes() {
        String[] cidades = {"Sao Paulo", "Curitiba","Rio de Janeiro"};

        System.out.println(Arrays.toString(cidades));
    }

    public static void main(String[] args) {
        ExercicioArray12 ex12 = new ExercicioArray12();
        ex12.listarNomes();
    }
}
