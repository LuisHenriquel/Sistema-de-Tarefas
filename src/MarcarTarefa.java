import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MarcarTarefa {
    public static void marcarTarefa(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da tarefa que deseja marca como concluida");
        String tarefaMarcada = scan.nextLine().trim();

        try{
            BufferedReader ler = new BufferedReader(new FileReader("tarefas.txt"));
            StringBuilder stringBuilder = new StringBuilder();
            String linha;

            while((linha = ler.readLine()) != null){
                if(linha.trim().equalsIgnoreCase("[ ] " + tarefaMarcada)){
                    stringBuilder.append("[X] ").append(tarefaMarcada).append("\n");
                }
                else{
                    stringBuilder.append(linha).append("\n");
                }
            }
            ler.close();

            BufferedWriter escrever = new BufferedWriter(new FileWriter("tarefas.txt"));
            escrever.write(stringBuilder.toString());
            escrever.close();

            System.out.println("Tarefa marcada como concluída!");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
