//

programa {
  funcao inicio() {
    inteiro numeros[10] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6}
    inteiro i, j, menor

    para(i = 0; i < 10; i++){
      para(j = i + 1; j <10; j++){
      //uma variável está em uma posição e a outra na posição a frente
        se(numeros[i] < numeros[j]){
        //verifica quem é o menor número das posições
          menor = numeros[i]
          //recebe o meno número
          numeros[i] = numeros[j]
          //fica na posição mais crescente pq é maior
          numeros[j] = menor
          //fica na posição mais decrescente
        }
      }}
    escreva("Vetor em ordem decrescente:\n")
    para(i=0; i<10; i++){
      escreva(numeros[i], ", ")
    }
    }
}
