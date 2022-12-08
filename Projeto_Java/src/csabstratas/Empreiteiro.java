package csabstratas;

public class Empreiteiro extends Funcionario{
    private double valorEmpreita;

    public Empreiteiro(int numRegistro, String nom, double valorEmpreita) {
        super(numRegistro, nom);
        this.valorEmpreita = valorEmpreita;
    }

    public double getValorEmpreita() {
        return valorEmpreita;
    }

    public void setValorEmpreita(double valorEmpreita) {
        this.valorEmpreita = valorEmpreita;
    }

    @Override
    public double calcularSalario() {
        return valorEmpreita;
    }
}
