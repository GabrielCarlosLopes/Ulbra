/*Faça um programa que leia uma matriz de 4 linhas e 3 colunas. Após a leitura some os valores de
cada linha e insira em um vetor de 4 posições ( a soma de cada linha da matiz na posição
correspondente do vetor. Escreva a matriz e o vetor resultante na tela.*/
#include<stdio.h>
#include<conio.h>
main()
{
	int m[4][3];
	int vetor[4] = {0};
	int l=0,c=0;
	for(l=0; l<4; l++){
		for(c=0; c<3; c++){
			printf("\nComplete a matriz, linha %d coluna %d: ", l,c);
			scanf("%d", &m[l][c]);
		}
	}
	printf("\nMATRIZ\n");
	for (l=0; l < 4; l++){
		for (c=0; c < 3; c++){
			printf("%d\t", m[l][c]);
		}
		printf("\n");
	}
	for (l=0; l<4; l++){
		for (c=0; c<3; c++){
			vetor[l] += m[l][c];
		}
	}
	for (l=0; l < 4; l++){
		printf("\n vetor %d: %d", l,vetor[l]);
	}
}
