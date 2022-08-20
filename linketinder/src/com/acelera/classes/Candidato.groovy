package com.acelera.classes

import groovy.transform.ToString

class Candidato {
    String nome, email, CPF, estado, CEP, descPessoal
    int idade
    ArrayList<String> competencias = []


    @Override
    public String toString() {
        return "Candidato: " + nome +"\n"+
                "e-mail: " + email +"\n"+
                "CPF: " + CPF +"\n"+
                "Estado: " + estado + "\n"+
                "CEP: " + CEP + "\n" +
                "Descrição: " + descPessoal + "\n" +
                "Competências: " + competencias + "\n";
    }

}
