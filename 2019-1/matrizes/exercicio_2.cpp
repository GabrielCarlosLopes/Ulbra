/*Faça um programa que faz a leitura de uma matriz de 4 linhas e 4 colunas e um número X. Após a
leitura conte quantas vezes o número X aparece na matriz.*/
#include<stdio.h>
#include<conio.h>
main()
{
	int m[4][4];
	int n,l,c,cont=0;
	printf("\nDigite um numero: ");
	scanf("%d", &n);
	for(l=0; l<4; l++){
		for(c=0; c<4; c++){
			printf("\nComplete a matriz, linha %d coluna %d: ", l,c);
			scanf("%d", &m[l][c]);
		}
	}
	for(l=0; l<4; l++){
		for(c=0; c<4; c++){
			if (n == m[l][c]){
				cont++;
			}
		}
	}
	printf("\nMATRIZ\n");
	for (l=0; l < 4; l++){
		for (c=0; c < 4; c++){
			printf("%d\t", m[l][c]);
		}
		printf("\n");
	}
	
	printf("\nO Numero %d aparece %d vezes na matriz", n, cont);
}
