Algoritmo "camiseta"

var i, c : inteiro
    s: caracter
inicio
      escreva("QUAL SUA IDADE: ")
      leia(i)
      escreval("QUAL A COR DA SUA CAMISETA")
      escreval("[1] ROSA")
      escreval("[2] AZUL")
      escreval("[3] PRETA")
      escreval("[4] LARANJA")
      escreval("[5] OUTRA COR")
      leia(c)
      escolha c
              caso 1
                    escreva("VALOR DO INGRESSO: R$20,00")
              caso 2
                    escreva("VALOR DO INGRESSO: R$30,00")
              caso 3
                   escreva("QUAL O SEXO: ")
                   leia(s)
                   se s="feminino" entao
                      escreva("VALOR DO INGRESSO: R$10,00")
                   senao
                      escreva("VALOR DO INGRESSO: R$15,00")
                   fimse
              caso 4
                    escreva("VALOR DO INGRESSO: R$25,00")
              caso 5
                    escreva("VALOR DO INGRESSO: R$45,00")
      fimescolha
fimalgoritmo