package com.zghero.classes;

public class Tarefa {
    private String nome;
    private String descricao;

    private String status;
    private int prioridade, idStatus;

    public Tarefa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(int i) {
        this.idStatus = i;
        if(i==1)
        {
            this.status = "A fazer";
        } else if (i==2) {
            this.status = "Fazendo";
        }
        else{
            this.status = "Feito.";
        }
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public void imprimeTarefa()
    {

        System.out.println("Nome: " + this.getNome());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Prioridade: " + this.getPrioridade());
        System.out.println("Status: " + this.getStatus());
        System.out.println();
    }


}
