/* Escreva um programa para ler 5 números inteiros positivos (utilize a função LePositivo). 
Para cada valor lido escrever a soma dos inteiros de 1 ao número informado. 
O resultado do cálculo desse somatório deve ser obtido através da função Somatorio.
Nome: LePositivo
DescriÇÃo: Faz a leitura de um valor. Se ele for negativo ou zero, a leitura deve ser repetida até que o valor lido seja positivo.
Entrada: Nenhuma.
Saída: (int) o valor lido.
Nome: Somatorio
Descrição: Calcula o somatório dos inteiros de 1 ao número fornecido como entrada.
Entrada: (int) Número limite do somatório.
Saída: (int) O valor do somatório.*/
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
