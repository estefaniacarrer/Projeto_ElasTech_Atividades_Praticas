package heranca;

public class Estudante1 extends Pessoa1 {
    private int numMatricula;
    private String curso;

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String exibirInfor(){
        return getName()+"/"+ getEmail()+"/"+getTelefone()+"/"+numMatricula+"/"+curso;
    }
}
