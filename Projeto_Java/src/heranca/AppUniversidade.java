package heranca;

public class AppUniversidade {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Estefania", "estefania@google.com","9549454354" );
// quando eu crio um Constructor na classe mae eu posso declarar as informações ali em cima e
// fica desnecessário as informações abaixo:
//        p.setNome("Estefania");
//        p.setEmail("estefania@google.com");
//        p.setTelefone("9549454354");

        System.out.println(p.exibirInfo());

        Estudante e = new Estudante("Jose", "jose.com", "983434375", 123456, "Medicina");
//        e.setNome("Jose");
//        e.setEmail("jose.com");
//        e.setTelefone("983434375");
//        e.setNumeroMatricula(123456);
//        e.setCurso("Medicina");

        System.out.println(e.exibirInfo());


    }
}
