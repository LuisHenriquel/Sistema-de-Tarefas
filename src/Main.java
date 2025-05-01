import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        System.out.println("Bem-Vindo ao sistema de tarefas selecione alguma das opções");
        while(run) {
            System.out.println("[1] Adicionar uma tarefa");
            System.out.println("[2] Remover uma tarefa");
            System.out.println("[3] Marcar tarefa como concluida");
            System.out.println("[4] Listar todas as tarefas");
            System.out.println("[5] Sair do Sistema");
            int opcao = scan.nextInt();
            if(opcao == 1){
                AdicionarTarefa.adicionarTarefa();
            } else if (opcao == 2) {
                RemoverTarefa.removerTarefas();
            }
            else if (opcao == 3) {
                MarcarTarefa.marcarTarefa();
            }
            else if (opcao == 4) {
                ListarTarefa.listarTarefa();
            }
            else if ( opcao == 5) {
                run = false;
            }

            else
                System.out.println("Digite uma opção valida!");
        }




    }
}