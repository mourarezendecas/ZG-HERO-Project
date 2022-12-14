package com.acelera.generators

import com.acelera.classes.Candidato

//String nome, email, CPF, estado, CEP, descPessoal
//String Python, Java, Spring Framework, Angular, Swift, Kotlin


class CriaCandidato {
    static def void cria(){
        def comp = 1
        Candidato c = new Candidato()

        printf("Digite o nome do candidato: ")
        c.setNome(System.in.newReader().readLine())
        printf("Digite o email do candidato: ")
        c.setEmail(System.in.newReader().readLine())
        printf("Digite o CPF do candidato: ")
        c.setCPF(System.in.newReader().readLine())
        printf("Digite o estado do candidato: ")
        c.setEstado(System.in.newReader().readLine())
        printf("Digite o CEP do candidato: ")
        c.setCEP(System.in.newReader().readLine())
        printf("Digite uma breve descrição pessoal: ")
        c.setDescPessoal(System.in.newReader().readLine())
        println("---COMPETÊNCIAS---")
        println("Escolha as competências ou digite 0 para sair")
        do
        {
            println("1 - Python")
            println("2 - Java")
            println("3 - Spring Framework")
            println("4 - Angular")
            println("5 - Swift")
            println("6 - Kotlin")
            println("0 - Sair")
            comp = System.in.newReader().readLine() as Integer

            switch (comp)
            {
                case 1:
                    c.competencias.add("Python")
                    println("Python adicionado as competências")
                    break;
                case 2:
                    c.competencias.add("Java")
                    println("Java adicionado as competências")
                    break;
                case 3:
                    c.competencias.add("Spring Framework")
                    println("Spring Framework adicionado as competências")
                    break;
                case 4:
                    c.competencias.add("Angular")
                    println("Angular adicionado as competências")
                    break;
                case 5:
                    c.competencias.add("Swift")
                    println("Swift adicionado as competências")
                    break;
                case 6:
                    c.competencias.add("Kotlin")
                    println("Kotlin adicionado as competências")
                    break;
            }
        }
        while(comp !=0)

        GeraCandidatoeEmpresa.addCandidato(c)
    }
}
