programa {
  funcao inicio() {
    cadeia nomes[3] = {"Isabela", "Amanda", "Fernando"}
    real notas[3][4] = {{10, 10, 9, 6},
                        {5, 10, 8, 5},
                        {8, 3, 1, 0}}
    //linha é cada aluno
    real medias[3]

    para(inteiro l=0; l<3; l++){
      real soma = 0
      para(inteiro c=0; c<4; c++){
        soma = soma + notas[l][c]
      }
      medias[l] = soma/4
    }

    inteiro aluno
    escreva("digite o número do aluno:\n")
    leia(aluno)
    limpa()

    cadeia apr
    se(medias[aluno] >= 6){
      apr = "aprovado"
    }senao{
      apr = "reprovado"
    }

    escreva("==================", "\n")
    escreva("   Alunx: ", nomes[aluno], "\n")
    escreva("------------------", "\n")
    escreva("   1B:  ", notas[aluno][0], "\n")
    escreva("   2B:  ", notas[aluno][1], "\n")
    escreva("   3B:  ", notas[aluno][2], "\n")
    escreva("   4B:  ", notas[aluno][3], "\n")
    escreva("------------------", "\n")
    escreva("   Média:  ", medias[aluno], "\n")
    escreva("  ", apr, "\n")
    escreva("==================", "\n")

  }
}