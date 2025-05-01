import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RemoverTarefa {
    public static void removerTarefas() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual Tarefa deseja remover ?");
        String tarefaParaRemover = scan.nextLine().trim(); // para remover os espaços extras

        try {
            BufferedReader ler = new BufferedReader(new FileReader("tarefas.txt"));
            StringBuilder novaLista = new StringBuilder();
            String linha;

            while ((linha = ler.readLine()) != null) {
                if (!linha.equalsIgnoreCase("[ ] " + tarefaParaRemover) &&
                !linha.trim().equalsIgnoreCase("[X] " + tarefaParaRemover)) {
                    novaLista.append(linha).append("\n");
                }
            }
            ler.close();

            BufferedWriter escrever  = new BufferedWriter(new FileWriter("tarefas.txt"));
            escrever.write(novaLista.toString());
            escrever.close();

            System.out.println("Tarefa removida com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
