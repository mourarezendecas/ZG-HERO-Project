package com.acelera.classes

//Nome, E-mail Corporativo, CNPJ, País, Estado, CEP e Descrição da empresa;

class Empresa {
    String nome, email, CNPJ, pais, estado, CEP, descricao;
    List competencias = []
    List cadidatosCurtidos = []

    @Override
    public String toString() {
        return "Empresa: " + nome +"\n"+
        "e-mail: " + email +"\n"+
        "CNPJ: " + CNPJ +"\n"+
        "País: " + pais +"\n"+
        "Estado: " + estado + "\n"+
        "CEP: " + CEP + "\n" +
        "Descrição: " + descricao + "\n" +
        "Competências esperadas: " + competencias + "\n";
    }

    def curtida (Candidato candidato){
        cadidatosCurtidos.add(candidato)
    }

}
