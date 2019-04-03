#include<stdio.h>
#include<conio.h>
main()
{
	int vetor[10],cont,soma=0;
	printf("\nPreencha o vetor:\n");
	for (cont=0; cont<10; cont++){
		scanf("%d", &vetor[cont]);
		if (vetor[cont]>=10){
			soma=soma+vetor[cont];
		}
		if (vetor[cont]<=0){
			break;
		}
	}
	printf("A SOMA DOS NUMEROS FOI DE: %d", soma);	
}
