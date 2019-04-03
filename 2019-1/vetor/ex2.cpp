#include<stdio.h>
#include<conio.h>
main()
{
	int vetor[20],cont,pares=0;
	printf("\nPreencha o vetor:\n");
	for (cont=0; cont<20; cont++){
		scanf("%d", &vetor[cont]);
	}
	for (cont=0; cont<20; cont++){
		if ((vetor[cont] % 2) == 0){
			pares++;
		}
	}
	printf("\npares: %d\n", pares);
}
