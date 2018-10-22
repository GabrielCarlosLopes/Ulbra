Algoritmo "desconto_de_venda"

var n, d, p1, p2, p5, p6: real

inicio
      escreva("QUAL VALOR DA VENDA:R$ ")
      leia(n)
      escrevaL("-------------------------")
      escreval("QUAL A FORMA DE PAGAMENTO")
      escrevaL("-------------------------")
      escreval("[1] A VISTA")
      escreval("[2] A PRAZO (30 DIAS)")
      escreval("[3] A PRAZO (60 DIAS)")
      escreval("[4] A PRAZO (90 DIAS)")
      escreval("[5] CARTAO DE DEBITO")
      escreval("[6] CARTAO DE CREDITO")
      leia(d)
      escolha d
              caso 1
                   p1<- (n*10)/100
                   escreva("TOTAL DA VENDA:R$",n-p1:5:2)
              caso 2
                   p2<- (n*5)/100
                   escreva("TOTAL DA VENDA:R$",n-p2:5:2)
              caso 3
                   escreva("TOTAL DA VENDA:R$",n:5:2)
              caso 4
                   p2<- (n*5)/100
                   escreva("TOTAL DA VENDA:R$",n+p2:5:2)
              caso 5
                   p5<- (n*8)/100
                   escreva("TOTAL DA VENDA:R$",n-p5:5:2)
              caso 6
                   p6<- (n*7)/100
                   escreva("TOTAL DA VENDA:R$",n-p6:5:2)
      fimescolha
fimalgoritmo