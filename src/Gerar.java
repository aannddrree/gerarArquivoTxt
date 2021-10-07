import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Gerar {
    public static void arquivoTabuada(String dir, int n){
        try {
            FileWriter arq  = new FileWriter(dir);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.printf("+--Resultado--+%n");

            for (int i=1; i<=10; i++) {
                gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
            }
            gravarArq.printf("+-------------+%n");
            arq.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
