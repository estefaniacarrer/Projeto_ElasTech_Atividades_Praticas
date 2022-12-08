package orientacaoobjetos;

public class ProdutoTesteA1 {

    public static void main(String[] args) {
        OAula1 p1, p2;

        p1 = new OAula1(123, "Computador", 1000.0);
        System.out.println("P1 = " + p1.exibir());

        p1 = new OAula1(256, "Mouse", 80.0);
        System.out.println("P1 = " + p1.exibir());

   /*     p2 = p1;

        p2.setPrice(1500.00);
        System.out.println("P1 = "+p1.exibir());
        System.out.println("P2 = "+p1.exibir());
*/
    }
}
