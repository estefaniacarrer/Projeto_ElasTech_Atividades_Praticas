package polimorfismo;

public class PIBank {
    public static void main(String[] args) {
        Conta c1 = new Conta("Estefania", "123.456.789.10", 123, 100);
        Conta c2 = new ContaEspecial ("Jose", "987.654.321.00", 456, 500, 500);


        System.out.println(c1);
        System.out.println(c2);

        c1.debitar(80);
        c2.debitar(550);

        System.out.println(c1);
        System.out.println(c2);
    }

}
