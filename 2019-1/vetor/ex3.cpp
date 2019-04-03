#include<stdio.h>
#include<conio.h>
main()
{
	int vetor[30],cont;
	printf("\nPreencha o vetor:\n");
	for (cont=0; cont<30; cont++){
		scanf("%d", &vetor[cont]);
	}
	printf("\nnumeros positivos:\n"); 
	for (cont=0; cont<30; cont++){
		if (vetor[cont]>0){
		printf("%d\n", vetor[cont]);
		}
	}
}
