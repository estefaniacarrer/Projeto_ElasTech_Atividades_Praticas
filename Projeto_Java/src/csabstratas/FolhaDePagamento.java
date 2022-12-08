package csabstratas;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario f1,f2,f3,f4;

        f1 = new Chefe(1234,"Jonas Chefe", 5000,15,500);
        f2 = new Comissionado(1235, "Ana Comissionada", 4000, 35);
        f3 = new Horista(1236, "Paula Designer", 80, 150);
        f4 = new Empreiteiro(1237,"Pedro Construtor", 5872.35);

        System.out.println(f1.getNumRegistro() + " - " + f1.getNom() + " R$ "+ f1.calcularSalario());
        System.out.println(f2.getNumRegistro() + " - " + f2.getNom() + " R$ "+ f2.calcularSalario());
        System.out.println(f3.getNumRegistro() + " - " + f3.getNom() + " R$ "+ f3.calcularSalario());
        System.out.println(f4.getNumRegistro() + " - " + f4.getNom() + " R$ "+ f4.calcularSalario());

    }

}
