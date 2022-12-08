package exercicios.aula19out;

public class ExercicioArray3 {

    int[] numeros = new int[4];

    public void encontraMenor() {
        numeros[0] = 90;
        numeros[1] = 60;
        numeros[2] = 140;
        numeros[3] = 41;

        int menor = numeros[0];  //90
        // percorrer a array
        for (int x =1 ; x < numeros.length ; x++) {
            //verificar o menor numero
            if (numeros [x] < menor) {
                menor = numeros[x]; //2
            }
            menor = Math.min(menor, numeros[x]);
        }

        System.out.println(menor);
    }

    public static void main(String[] args) {
        ExercicioArray3 ex3 = new ExercicioArray3();
        ex3.encontraMenor();

    }
}


