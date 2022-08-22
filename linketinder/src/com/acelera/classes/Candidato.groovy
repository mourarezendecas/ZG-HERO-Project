package com.acelera.classes

import groovy.transform.ToString

class Candidato {
    String nome, email, CPF, estado, CEP, descPessoal
    int idade
    List competencias = []
    List empresasCurtidas = []

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

    def curtida (Empresa empresa){
        empresasCurtidas.add(empresa)
    }

}
