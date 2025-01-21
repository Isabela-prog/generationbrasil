programa {
  funcao inicio() {
    cadeia nome[3]
    //não é necessário colocar o tamanho do vetor, quando é declarado dessa forma

    para(inteiro i = 0; i <= 2; i++){
      escreva("digite um nome:\n")
      leia(nome[i])
      limpa()
    }

    para(inteiro i = 0; i <= 2; i++){
      escreva(i, ": ", nome[i], "\n")
    }
  }
}
