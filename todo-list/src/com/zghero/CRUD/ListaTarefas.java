package com.zghero.CRUD;

import java.util.ArrayList;

public class ListaTarefas {

    static ArrayList<Tarefa> tarefas = new ArrayList<>();

    public static  void adicionarTarefas(Tarefa tarefa)
    {
        tarefas.add(tarefa);
    }
    public static void listarTarefas()
    {
        for(Tarefa tasks: tarefas)
        {
            System.out.println();
            System.out.println("----- TAREFA -----");
            System.out.println("Nome: " + tasks.getNome());
            System.out.println("Descrição: " + tasks.getDescricao());
            System.out.println("Prioridade: " + tasks.getPrioridade());
            System.out.println("Status: " + tasks.getStatus());
            System.out.println();
        }
    }

    public static ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public static void setTarefas(ArrayList<Tarefa> tarefas) {
        ListaTarefas.tarefas = tarefas;
    }

}
