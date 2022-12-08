package exercicios.aula19out;

public class For2 {

    public void escreveTabuada() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; 1 < 10; i++) {
            int resultado = 2 * i;

            sb.append("2 * ").append(i);
            sb.append(" = ");
            sb.append(resultado);
            sb.append(System.getProperty("line.separator"));
        }

    }

    public void imprimeTodasTabuadas(){
        StringBuffer sb = new StringBuffer();
        for (int i = 1 ; i < 10; i++) {
            for (int j = 0; j< 10 ; j++) {
                int resultado = i * j;

                sb.append(i).append(" * ").append(j);
                sb.append(" = ");
                sb.append(resultado);
                sb.append(System.getProperty("line.separator"));
            }
            sb.append(System.getProperty("line.separator"));
            sb.append(System.getProperty("line.separator"));
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        For2 tabuada = new For2();
        //tabuada.escreveTabuada();

       tabuada.imprimeTodasTabuadas();

    }
}
