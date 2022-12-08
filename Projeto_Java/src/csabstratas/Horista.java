package csabstratas;

public class Horista extends Funcionario{
    private int numHoras;
    private double valorHoras;

    public Horista(int numRegistro, String nom, int numHoras, double valorHoras) {
        super(numRegistro, nom);
        this.numHoras = numHoras;
        this.valorHoras = valorHoras;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public double getValorHoras() {
        return valorHoras;
    }

    public void setValorHoras(double valorHoras) {
        this.valorHoras = valorHoras;
    }

    @Override
    public double calcularSalario() {
        return numHoras*valorHoras;
    }
}
