Algoritmo "Transformar os valores"
Var
   Num, Valor: inteiro
   Resultado1, Resultado2, Resultado3: Caracter
Inicio
   escreval("----------------------------------------------")
   escreval("Transforme um valor decimal em Binário!!")
   escreval("----------------------------------------------")
   escreval("Digite um valor Decimal: ")
   leia(Num)
   Valor <- (Num)
   enquanto (Num > 0) faca
      escolha (Num mod 2)
      caso 0
         Resultado1 <- ("0" + Resultado1)
      caso 1
         Resultado1 <- ("1" + Resultado1)
      fimEscolha
      Num <- (Num div 2)
   fimEnquanto
   escreval("O valor", Valor, " em Dicimal será de: ", Resultado1, " em Binários!!")
   escreval("----------------------------------------------")
   escreval("Transforme um valor decimal em Octal!!")
   escreval("----------------------------------------------")
   escreval("Digite um valor Decimal: ")
   leia(Num)
   Valor <- (Num)
   enquanto (Num > 0) faca
      escolha (Num mod 8)
      caso 1
         Resultado2 <- ("1" + Resultado2)
      caso 2
         Resultado2 <- ("2" + Resultado2)
      caso 3
         Resultado2 <- ("3" + Resultado2)
      caso 4
         Resultado2 <- ("4" + Resultado2)
      caso 5
         Resultado2 <- ("5" + Resultado2)
      caso 6
         Resultado2 <- ("6" + Resultado2)
      caso 7
         Resultado2 <- ("7" + Resultado2)
      fimEscolha
      Num <- (Num div 8)
   fimEnquanto
   escreval("O valor", Valor, " em Dicimal será de: ", Resultado2, " em Octal!!")
   escreval("--------------------------------------------------")
   escreval("transforme um valor decimal em Hexadecimal!!")
   escreval("--------------------------------------------------")
   escreval("Digite um valor Decimal: ")
   leia(Num)
   Valor <- (Num)
   enquanto (Num > 0) faca
      escolha (Num mod 16)
      caso 1
         Resultado3 <- ("1" + Resultado3)
      caso 2
         Resultado3 <- ("2" + Resultado3)
      caso 3
         Resultado3 <- ("3" + Resultado3)
      caso 4
         Resultado3 <- ("4" + Resultado3)
      caso 5
         Resultado3 <- ("5" + Resultado3)
      caso 6
         Resultado3 <- ("6" + Resultado3)
      caso 7
         Resultado3 <- ("7" + Resultado3)
      caso 8
         Resultado3 <- ("8" + Resultado3)
      caso 9
         Resultado3 <- ("9" + Resultado3)
      caso 10
         Resultado3 <- ("A" + Resultado3)
      caso 11
         Resultado3 <- ("B" + Resultado3)
      caso 12
         Resultado3 <- ("C" + Resultado3)
      caso 13
         Resultado3 <- ("D" + Resultado3)
      caso 14
         Resultado3 <- ("E" + Resultado3)
      caso 15
         Resultado3 <- ("F" + Resultado3)
      fimEscolha
      Num <- (Num div 16)
   fimEnquanto
   escreval("O valor", Valor, " em Dicimal será de: ", Resultado3, " em Hexadecimais!!")
fimAlgoritmo