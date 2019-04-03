#include<stdio.h>
#include<conio.h>
main()
{
	int vetor[30],cont,menornumero=0;
	printf("\nPreencha o vetor:\n");
	for (cont=0; cont<30; cont++){
		scanf("%d", &vetor[cont]);
	}
	menornumero=vetor[0];
	for (cont=0; cont<30; cont++){
		if (vetor[cont]<=menornumero){
			menornumero=vetor[cont];
		}
	}
	printf("\nMenor numero: %d", menornumero);
}
