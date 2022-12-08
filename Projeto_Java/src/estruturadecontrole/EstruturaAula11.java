package estruturadecontrole;

// não rodou igual ao vscode

public class EstruturaAula11 {
    public static void main(String[] args) {
        System.out.println(("Parametros passados pela linha de comando...."));
        for (int pos = 0; pos < args.length; pos++) {
            System.out.println("Param " + pos + " = " + args[pos]);
        }

    }
}
