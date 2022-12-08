package exemplosapostila;

public class Exemplo5 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("camilo");

        sb1.delete(3, 5);
        System.out.println(sb1);

        sb1.append("medeiros");
        sb1.insert(2, "!");
        System.out.println(sb1);

        sb1.append(" neto");
        System.out.println(sb1.toString());
    }
}
