programa {
  funcao inicio() {
    real num1, num2, res
    escreva("entre com o num1: ")
    leia(num1)
    escreva("entre com o num2: ")
    leia(num2)
    res = num1 + num2
    escreva("soma = ", res)
    //a "," é uma concatenadora
    res = num1 - num2
    escreva("\nsubtração = ", res)
    ///n serve para pular a linha
    res = num1 * num2
    escreva("\nmultiplicação = ", res)
    res = num1 / num2
    escreva("\ndivisão = ", res)
  }
}