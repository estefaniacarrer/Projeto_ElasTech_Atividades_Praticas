package heranca;

public class AppUniversidade1 {
    public static void main(String[] args) {
        Pessoa1 p1 = new Pessoa1();
        p1.setName("Alice");
        p1.setEmail("alice.com");
        p1.setTelefone("988657456");

        System.out.println(p1.exibirInfo());


    Estudante1 e1 = new Estudante1();
            e1.setName("Paulo");
            e1.setEmail("paulo.com");
            e1.setTelefone("9838383");
            e1.setNumMatricula(1234);
            e1.setCurso("Medicina");

        System.out.println(e1.exibirInfor());


    }
}
