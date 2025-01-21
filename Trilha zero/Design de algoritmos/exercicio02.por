programa {
  funcao inicio() {
    inteiro numeros[10]
    inteiro soma, par
    real media
    soma = 0

    para(inteiro i=0; i < 10; i++){
      escreva("digite o número:\n")
      //recebe os números do usuário
      leia(numeros[i])
      //monta o vetor
      soma = soma + numeros[i]
      //já faz a soma dos números do vetor, guardando na variável soma
      limpa()
    }
  
    escreva("Elementos ímpares: ")
    para(inteiro i = 0; i < 10; i++){
      par = numeros[i] % 2
      //abrigará o resto da divisão
      se(par != 0){
        //se o resto for diferente de zero, não é divisível por 2 e, portanto, ímpar
        escreva(numeros[i], ", ")
      }
    }
    escreva("\n")

    escreva("Elementos pares: ")
    para(inteiro i = 0; i < 10; i++){
      par = numeros[i] % 2
      se(par == 0){
        //se o resto for zero, é divisível por 2 e, portanto, par
        escreva(numeros[i], ", ")
      }
    }
    escreva("\n")

    escreva("\nSoma: ", soma)

    media = soma / 10
    //cálculo da media
    escreva("\nMedia: ", media)
    }
    
  }