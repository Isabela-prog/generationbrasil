programa {
  inclua biblioteca Util
  funcao inicio() {
    inteiro x, acm = 0
    faca{
      limpa()
      escreva("entre com um valor: \n")
      leia(x)
      acm = acm + x
    }enquanto (x != 0)
    limpa()
    escreva("você acumulou ", acm)
  }
}