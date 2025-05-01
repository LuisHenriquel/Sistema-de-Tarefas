import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AdicionarTarefa {

    public static void adicionarTarefa() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantas tarefas deseja adiconar");
        int Numeros_Tarefas = scan.nextInt();
        scan.nextLine(); // Limpar buffer
        try {

            BufferedWriter escrever = new BufferedWriter(new FileWriter("tarefas.txt", true));

            for (int i = 1; i <= Numeros_Tarefas; i++) {
                System.out.println("Digite a tarefa " + i + ": ");
                String tarefa = scan.nextLine();
                escrever.write("[ ] " + tarefa);
                escrever.newLine(); // quebra de linha
            }
            escrever.close(); // fecha o arquivo
            System.out.println("Tarefas adicionadas com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

    }
}



