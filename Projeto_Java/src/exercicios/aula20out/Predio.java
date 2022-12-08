package exercicios.aula20out;

import javax.imageio.stream.ImageInputStream;

public class Predio {
    private String endereco;
    private String cidade;
    private String estado;
    private int numAptos;

    public Predio() {

    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNumAptos() {
        return numAptos;
    }

    public void setNumAptos(int numAptos) {
        if(numAptos > 0) {
            this.numAptos = numAptos;
        }else {
            System.out.println("O numero do apartamento precisa ser maior que 0");
        }
    }

    public static void main(String[] args) {
        Predio p1 = new Predio();
        Predio p2 = new Predio();

        p1.setEndereco("Rua A");
        p1.setCidade("Sao Paulo");
        p1.setEstado("Sao Paulo");
        p1.setNumAptos(15);

        System.out.println(" ");
        System.out.println("Dados apartamento 1:");
        System.out.println("Endereco: "+ p1.getEndereco());
        System.out.println("Cidade: "+ p1.getCidade());
        System.out.println("Estado: "+ p1.getEstado());
        System.out.println("Numero do apartamento: "+ p1.getNumAptos());
        System.out.println(" ");

        p2.setEndereco("Rua B");
        p2.setCidade("Rio de Janeiro");
        p2.setEstado("Rio de Janeiro");
        p2.setNumAptos(50);

        System.out.println(" ");
        System.out.println("Dados apartamento 2:");
        System.out.println("Endereco: "+ p2.getEndereco());
        System.out.println("Cidade: "+ p2.getCidade());
        System.out.println("Estado: "+ p2.getEstado());
        System.out.println("Numero do apartamento: "+ p2.getNumAptos());
    }
}
