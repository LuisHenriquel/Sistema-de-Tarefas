import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ListarTarefa {
    public static void listarTarefa() {

        try {
            BufferedReader ler = new BufferedReader(new FileReader("tarefas.txt"));
            String linha;
            int contador = 1;

            System.out.println("Tarefas cadastradas");
            while ((linha = ler.readLine()) != null) {
                System.out.println( " " + linha);
                contador++;
            }

            ler.close();


        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }


    }
}
