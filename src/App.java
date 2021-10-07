import javax.swing.*;

public class App {
    public static void main(String[] args) {
        String dir = "C:\\tmp\\arquivoteste\\tabuada.txt";
        int n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Informe o número para a tabuada"));

        Gerar.arquivoTabuada(dir,n);

        System.out.printf("\nTabuada do %d foi gravada com sucesso em "+ dir +".\n", n);
    }
}




// Se o método Arquivo não foi static:
//Gerar g = new Gerar();
//g.Arquivo(dir,n);