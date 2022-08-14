import java.util.ArrayList;

public class ListaTarefas {

    static ArrayList<Tarefa> tarefas = new ArrayList<>();

    public static  void adicionarTarefas(Tarefa tarefa)
    {
        tarefas.add(tarefa);
    }
    public static void listarTarefas()
    {
        int i = 0;
        for(Tarefa tasks: tarefas)
        {
            System.out.println("TAREFA Nº " + i+1);
            System.out.println("Nome: " + tasks.getNome());
            System.out.println("Descrição: " + tasks.getDescricao());
            System.out.println("Prioridade: " + tasks.getPrioridade());
            System.out.println("Status: " + tasks.getStatus());
            i++;
        }
        i = 0;
    }

}
