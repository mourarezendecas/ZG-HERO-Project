import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        iniciaApp();
    }

    public static void iniciaApp(){
        Scanner input = new Scanner(System.in);
        System.out.println("--- TO DO LIST ---");
        System.out.println("1 - Criar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Atualizar Status");
        System.out.println("4 - Deletar tarefas");
        System.out.println("5 - Fechar programa");

        System.out.printf("Opção desejada: ");
        int option = input.nextInt();

        switch (option)
        {
            case 1:
                System.out.println("Criando tarefa");
                CriaTarefa.adicionaTarefa();
                System.out.println("TAREFA CADASTRADA COM SUCESSO");
                iniciaApp();
                break;
            case 2:
                System.out.println("Listando tarefas");
                ListaTarefas.listarTarefas();
                iniciaApp();
                break;
            case 3:
                System.out.println("Setando status");
                iniciaApp();
                break;
            case 4:
                System.out.println("Deletando tarefas");
                break;
            case 5:
                System.out.println("Saindo do programa");
                break;
            default:
                System.out.println("Entrada inválida");
                iniciaApp();
        }

    }

}
