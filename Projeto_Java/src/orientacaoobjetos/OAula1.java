package orientacaoobjetos;

public class OAula1 {
    private int codigo;
    private String nome;
    private double price;

    public OAula1(int codigo, String nome, double price) {
        this.codigo = codigo;
        this.nome = nome;
        this.price = price;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

       public String exibir(){
        return codigo+ " - " + nome + "- R$ " + price;
       }
}
