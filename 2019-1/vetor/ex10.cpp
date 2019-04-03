#include <stdio.h>
#include <stdlib.h>
main() 
{
	int num[20], par[10], impar[10];
	int i=0, x=0, y=0;
	for (i=0; i<20; i++) {
		printf ("Informe valor: ");
		scanf ("%d",&num[i]);
		if (num[i] == 0) {
			printf ("\nEncerrado.\n");
			break;
		}
	   	if (num[i]%2 == 0) {
	   	par[x] = num[i]; 
	   	x++;
			if (x==10) 
				break;
			else 
				continue;
	   	}
		else { 
		impar[y] = num[i];
	   	y++;
			if (y==10) 
				break;
		  	else 
				continue;
	   	}
	}
	printf ("\nNumeros pares: ");
	for (i=0; i<x; i++){
		printf ("%d ", par[i]);
	}   
	printf ("\nNumeros impares: ");
	for (i=0; i<y; i++){
		printf ("%d ", impar[i]);
	}		   
}
