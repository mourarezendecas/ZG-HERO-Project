package com.zghero.CRUD;

import com.zghero.classes.Tarefa;

import java.util.ArrayList;

public class ListaTarefas {

    static ArrayList<Tarefa> tarefas = new ArrayList<>();

    public static  void adicionarTarefas(Tarefa tarefa)
    {
        tarefas.add(tarefa);
    }
    public static void listarTarefas()
    {
        int i = 1;
        for(Tarefa tasks: tarefas)
        {
            System.out.println();
            System.out.println("----- TAREFA " + i + " -----");
            tasks.imprimeTarefa();
            i++;
        }
    }

    public static void listarTarefasPrioridade(){
        for(Tarefa tasks: tarefas)
        {
            if (tasks.getPrioridade() == 1)
            {
                tasks.imprimeTarefa();
            }
        }
        for(Tarefa tasks: tarefas)
        {
            if (tasks.getPrioridade() == 2) {
                tasks.imprimeTarefa();
            }
        }
        for(Tarefa tasks: tarefas)
        {
            if (tasks.getPrioridade() == 3) {
                tasks.imprimeTarefa();
            }
        }
        for(Tarefa tasks: tarefas)
        {
            if (tasks.getPrioridade() == 4) {
                tasks.imprimeTarefa();
            }
        }
        for(Tarefa tasks: tarefas)
        {
            if (tasks.getPrioridade() == 5) {
                tasks.imprimeTarefa();
            }
        }
    }

    public static ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public static void setTarefas(ArrayList<Tarefa> tarefas) {
        ListaTarefas.tarefas = tarefas;
    }

}
