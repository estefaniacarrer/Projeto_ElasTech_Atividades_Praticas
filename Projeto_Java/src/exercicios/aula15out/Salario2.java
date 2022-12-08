package exercicios.aula15out;

import javax.imageio.stream.ImageInputStream;

public class Salario2 {

    public int salario; // isso é um atributo

    public int informarValorImposto(int salario){ // isso é um metodo

        if(salario > 5000){
            return 15;
        }else {
            return 5;
        }
}

    public static void main(String[] args) {
        Salario2 s = new Salario2();
        System.out.println(s.informarValorImposto(10000)); // o valor é incluido aqui para testar o metodo
    }

}
