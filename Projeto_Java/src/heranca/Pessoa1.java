package heranca;

public class Pessoa1 {
    private String name;
    private String email;
    private String telefone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String exibirInfo() {
        return name + "/" + email + "/"+ telefone;
    }

}
