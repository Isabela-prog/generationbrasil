programa {
  inclua biblioteca Matematica --> mat
  funcao inicio() {
    inteiro mes
    escreva("digite um número de 1 a 12 para saber o mês:\n")
    leia(mes)
    escolha(mes){
      caso 1:
        escreva("janeiro")
        pare
      caso 2:
        escreva("fevereiro")
        pare
      caso 3:
        escreva("março")
        pare
      caso 4:
        escreva("abril")
        pare
      caso 5:
        escreva("maio")
        pare
      caso 6:
        escreva("junho")
        pare
      caso 7:
        escreva("julho")
        pare
      caso 8:
        escreva("agosto")
        pare
      caso 9:
        escreva("setembro")
        pare
      caso 10:
        escreva("outubro")
        pare
      caso 11:
        escreva("novembro")
        pare
      caso 12:
        escreva("dezembro")
        pare
      caso contrario:
        escreva("opção inválida")
        pare
    }
 }
}