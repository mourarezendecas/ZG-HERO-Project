package com.acelera.classes

import groovy.transform.ToString

class Candidato {
    String nome, email, CPF, estado, CEP, descPessoal
    int idade
    List competencias = []
    List empresasCurtidas = []

    @Override
    public String toString() {
        return """
                \n
                Candidato: $nome
                e-mail: $email
                CPF: $CPF
                Estado: $estado
                CEP: $CEP
                Descrição: $descPessoal
                Competências: $competencias
                \n
                """
    }

    def curtida (Empresa empresa){
        empresasCurtidas.add(empresa)
    }

}
