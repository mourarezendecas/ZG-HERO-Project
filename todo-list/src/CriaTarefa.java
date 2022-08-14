import java.util.ArrayList;
import java.util.Scanner;

public class CriaTarefa {

    static Scanner input = new Scanner(System.in);
    ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();

    public static void adicionaTarefa(){
        Tarefa tarefa = new Tarefa();

        System.out.printf("Digite o nome da tarefa: ");
        tarefa.setNome(input.nextLine());
        System.out.printf("Digite a descrição da tarefa: ");
        tarefa.setDescricao(input.nextLine());
        System.out.printf("Digite a prioridade da tarefa: ");
        tarefa.setPrioridade(input.nextInt());

    }
}
