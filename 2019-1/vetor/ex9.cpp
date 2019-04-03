#include<stdio.h>
#include<conio.h>
main()
{
	int vetorx[10],vetory[10],cont,cont2=9;
	printf("\nPreencha o vetor:\n");
	for (cont=0; cont<10; cont++){
		scanf("%d", &vetorx[cont]);
		}
	printf("\nVetor Y:\n");
	for(cont=0; cont<10; cont++){
    	vetory[cont] = vetorx[cont2--];
    	printf("\n%d", vetory[cont]);
	}
}
	
