package com.acelera.main

import com.acelera.classes.Candidato
import com.acelera.classes.Empresa
import com.acelera.generators.GeraCandidatoeEmpresa

class Curtidas {
    static def void main(){
        int i = 1
        println "1 - ACESSAR COMO EMPRESA"
        println "2 - ACESSAR COMO CANDIDATO"
        printf "Digite a opção desejada: "
        def opt = System.in.newReader().readLine() as Integer
        println "---EMPRESA: " + i + " ---"


        if(opt==1) {
            for (Empresa empresa : GeraCandidatoeEmpresa.listaEmpresas()) {
                empresa.toString()
            }
        }
        else
        {
            for (Candidato candidato : GeraCandidatoeEmpresa.listaCandidatos()) {

                candidato.toString()
            }
        }


    }
}
