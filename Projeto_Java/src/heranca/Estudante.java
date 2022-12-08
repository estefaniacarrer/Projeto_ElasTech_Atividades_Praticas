package heranca;

//subclasse
public class Estudante extends Pessoa {
    private int numeroMatricula;
    private String curso;

    public Estudante(String nome, String email, String telefone, int numMat, String curso){
         super(nome, email, telefone);
         this.numeroMatricula = numMat; // apenas para diminuir o nome
        this.curso = curso;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //aqui eu faço uma sobrescrita de metodo = redefinição da classe mae
    public String exibirInfo(){
        return super.nome+ "/"+super.email+"/"+"/"+super.telefone+"/"+this.numeroMatricula+"/"+this.curso;


    }
}
