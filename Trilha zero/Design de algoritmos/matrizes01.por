programa {
  funcao inicio() {
    const inteiro TAMANHO = 3
    inteiro mat[TAMANHO][2]
    //3 linhas por duas colunas

    para(inteiro l = 0; l < TAMANHO; l++){
      para(inteiro c = 0; c <= 1; c++){
        escreva("valor:\n")
        leia(mat[l][c])
        limpa()
      }
    }

    para(inteiro l = 0; l < TAMANHO; l++){
      para(inteiro c = 0; c <= 1; c++){
        escreva("[", mat[l][c], "]")
      }
      escreva("\n")
    }
  }
}