package com.zghero.CRUD;

import com.zghero.classes.Tarefa;

import java.util.Scanner;

public class CriaTarefa {

    static Scanner input = new Scanner(System.in);

    public static void adicionaTarefa(){
        Tarefa tarefa = new Tarefa();

        System.out.printf("Digite o nome da tarefa: ");
        tarefa.setNome(input.nextLine());
        System.out.printf("Digite a descrição da tarefa: ");
        tarefa.setDescricao(input.nextLine());
        System.out.printf("Digite a prioridade da tarefa(1-5): ");
        tarefa.setPrioridade(input.nextInt());
        input.nextLine();
        tarefa.setStatus(1);
        ListaTarefas.adicionarTarefas(tarefa);
    }

}
