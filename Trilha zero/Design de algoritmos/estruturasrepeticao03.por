programa {
  funcao inicio() {
    inteiro x, tab, res
    
    escreva("entre com o valor da tabuada:\n")
    leia(tab)
    
    para(x=1; x<=10; x++){
      res= x * tab
      escreva("\n", x, " X ", tab, " = ", res)
    }
  } 
}