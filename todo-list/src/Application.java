import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--- TO DO LIST ---");
        System.out.println("1 - Criar tarefa");
        System.out.println("2 - Listar tarefas");
        System.out.println("3 - Deletar tarefas");

        System.out.printf("Opção desejada: ");
        int option = input.nextInt();

        switch (option)
        {
            case 1:
                System.out.println("Criando tarefa");
                CriaTarefa.adicionaTarefa();
                break;
            case 2:
                System.out.println("Listando tarefas");
                break;
            case 3:
                System.out.println("Deletando tarefas");
                break;
        }
    }
}
