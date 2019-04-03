#include<stdio.h>
#include<conio.h>
main()
{
	int vetorx[10],vetory[10],cont,resultado=0;
	printf("\nPreencha o vetor:\n");
	for (cont=0; cont<10; cont++){
		scanf("%d", &vetorx[cont]);
		}
	printf("\nPreencha outro vetor:\n");
	for (cont=0; cont<10; cont++){
		scanf("%d", &vetory[cont]);
	}
	for (cont=0; cont<10; cont++){
		resultado=vetorx[cont]*vetory[cont];
		printf("\n %d x %d = %d\n", vetorx[cont],vetory[cont], resultado);	
	}
}
