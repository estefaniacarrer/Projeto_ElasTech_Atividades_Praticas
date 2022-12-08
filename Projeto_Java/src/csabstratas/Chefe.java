package csabstratas;

public class Chefe extends Funcionario{
    private double salarioBase;
    private double adicionalFuncao;
    private double beneficioTerno;

    public Chefe(int numRegistro, String nom, double salarioBase, double adicionalFuncao, double beneficioTerno) {
        super(numRegistro, nom);
        this.salarioBase = salarioBase;
        this.adicionalFuncao = adicionalFuncao;
        this.beneficioTerno = beneficioTerno;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getAdicionalFuncao() {
        return adicionalFuncao;
    }

    public void setAdicionalFuncao(double adicionalFuncao) {
        this.adicionalFuncao = adicionalFuncao;
    }

    public double getBeneficioTerno() {
        return beneficioTerno;
    }

    public void setBeneficioTerno(double beneficioTerno) {
        this.beneficioTerno = beneficioTerno;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + salarioBase*adicionalFuncao/100 + beneficioTerno; // informações retiradas da especificação do exercicio.
    }

}
