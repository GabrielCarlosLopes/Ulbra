/* Escreva um programa para ler 5 n�meros inteiros positivos (utilize a fun��o LePositivo). 
Para cada valor lido escrever a soma dos inteiros de 1 ao n�mero informado. 
O resultado do c�lculo desse somat�rio deve ser obtido atrav�s da fun��o Somatorio.
Nome: LePositivo
Descri��o: Faz a leitura de um valor. Se ele for negativo ou zero, a leitura deve ser repetida at� que o valor lido seja positivo.
Entrada: Nenhuma.
Sa�da: (int) o valor lido.
Nome: Somatorio
Descri��o: Calcula o somat�rio dos inteiros de 1 ao n�mero fornecido como entrada.
Entrada: (int) N�mero limite do somat�rio.
Sa�da: (int) O valor do somat�rio.*/
#include <stdio.h>
int somatorio(int valor)
{
    if(valor == 1){
             return (1);
    }else{
          return (valor + somatorio(valor-1));      
    }
}
main()
{
    
    int numeros[5],i;    
    
    printf("Entre com os 5 valores: \n");
    for (i=0; i<5; i++){
        do{
            scanf("%d",&numeros[i]);
            if(numeros[i] <= 0){
                printf("Entre novamente com um valor: Positivo: \n");
            }                         
        }while(numeros[i] <= 0);
    }
    for (i = 0; i < 5; i++){
		printf("Soma dos numeros de 1 ate %d = %d\n",numeros[i] ,somatorio(numeros[i]) );
    } 
}
