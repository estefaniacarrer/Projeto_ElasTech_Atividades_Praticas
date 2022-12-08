package exercicios.aula20out;

public class Carro {
    private int numPortas;
    private int ano;
    private double preco;
    private int km;
    private String marca;
    private String cor;

    public Carro() {

    }

    public Carro(String marca, String cor) {
        this.marca = marca;
        this.cor = cor;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static void main(String[] args) {
        Carro c1 =  new Carro();
        c1.setNumPortas(4);
        c1.setAno(2018);
        c1.setPreco(50000.00);
        c1.setKm(10000);
        c1.setMarca("Fiat");
        c1.setCor("Preto");

        System.out.println("Dados do carro 1");
        System.out.println("Carro: "+ c1.getMarca());
        System.out.println("Ano: "+ c1.getAno());
        System.out.println("Quantidade de portas: "+ c1.getNumPortas());
        System.out.println("Kilometragem: "+ c1.getKm());
        System.out.println("Cor: "+ c1.getCor());
        System.out.println("Preco: "+ c1.getPreco());

        Carro c2 =  new Carro("Jeep", "Prata");
        c2.setNumPortas(2);
        c2.setAno(2020);
        c2.setPreco(90000.00);
        c2.setKm(5000);

        System.out.println(" ");
        System.out.println("Dados do carro 2");
        System.out.println("Carro: "+ c2.getMarca());
        System.out.println("Ano: "+ c2.getAno());
        System.out.println("Quantidade de portas: "+ c2.getNumPortas());
        System.out.println("Kilometragem: "+ c2.getKm());
        System.out.println("Cor: "+ c2.getCor());
        System.out.println("Preco: "+ c2.getPreco());

    }
}
