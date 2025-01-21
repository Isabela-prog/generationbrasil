programa {
  funcao inicio() {
    cadeia pais
    inteiro idade
    logico permissao
    escreva("Country/país? (BRA, USA, POR)\n")
    leia(pais)
    limpa()

    se(pais == "BRA" ou pais == "POR"){
      escreva("idade?\n")
    }senao{
      escreva("age?\n")
    }
    leia(idade)
    limpa()
    //limpar o console
    
    se((pais == "BRA" e idade >= 18) ou (pais == "USA" e idade >= 21) ou (pais == "POR")){
      permissao = verdadeiro
    } senao{
      permissao = falso
    }

    se(permissao e (pais == "POR" ou pais == "BRA")){
      escreva("Permitido")
    }senao se(permissao e pais == "USA"){
      escreva("Allowed")
    }senao se(nao permissao e pais == "USA"){
      escreva("Not allowed")
    }senao{
      escreva("Não permetido")
    }
  }
}
