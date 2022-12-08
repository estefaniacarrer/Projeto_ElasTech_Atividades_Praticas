package exercicios.aula19out;

public class ExercicioArray32 {

    int[] numeros = new int [4];

    public void encontraMenor(){
        numeros[0] = 90;
        numeros[1] = 30;
        numeros[2] = 8;
        numeros[3] = 66;

        int menor = numeros[0];
        for (int x=1; x < numeros.length; x++){
        if (numeros[x] < menor) {
            menor = numeros[x];
        }
        menor = Math.min(menor, numeros[x]);  // não sei o que é esse comando pesquisar
    }
        System.out.println(menor);
}

    public static void main(String[] args) {
        ExercicioArray32 ex32 = new ExercicioArray32();
        ex32.encontraMenor();
    }
}































    /* public void menor(Integer[]array){ -------------------Não consegui fazer com Integer

        int menor = 0;
        for (Integer x: array){
            if ( x < menor){
                menor = x;

            }
            menor = Math.min(menor,x);

        }
        System.out.println(menor);
    }

    public static void main(String[] args) {
        Integer[] numeros = new Integer[4];

        numeros[0] = 90;
        numeros[1] = 90;
        numeros[2] = 30;
        numeros[3] = 10;

        ExercicioArray32 ex32 = new ExercicioArray32();
        ex32.menor(numeros);
    }
}
*/