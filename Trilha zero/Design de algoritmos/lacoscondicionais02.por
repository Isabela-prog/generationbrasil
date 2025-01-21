programa {
  inclua biblioteca Matematica --> mat
  funcao inicio() {
    cadeia nome
    real n1, n2, n3, media
    escreva("seu nome:\n")
    leia(nome)
    escreva("primeira nota:\n")
    leia(n1)
    escreva("segunda nota:\n")
    leia(n2)
    escreva("terceira nota:\n")
    leia(n3)

    media = (n1 + n2 + n3)/3
    limpa()

    se(media >= 7.0){
      escreva(nome, ", você passou, com média: ", mat.arredondar(media, 2))
    }senao se(media >= 4 e media < 7){
      escreva(nome, ", você ficou de exame, com média: ", mat.arredondar(media, 2))
    }senao{
      escreva(nome, ", você não passou, com média: ", mat.arredondar(media, 2))
    }
    
 }
}
