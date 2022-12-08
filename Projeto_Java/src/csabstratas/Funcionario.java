package csabstratas;

public abstract class Funcionario {
    protected int numRegistro;
    protected String nom;

    public Funcionario(int numRegistro, String nom) {
        super();
        this.numRegistro = numRegistro;
        this.nom = nom;
    }
// as classes abstratas me permitem criar as "clausulas contratuais" para
    // que as subclasses se comprometam a implementar

    public abstract double calcularSalario();
    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
