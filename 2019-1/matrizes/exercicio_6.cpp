/*Escreva um programa que leia uma matriz de 5 linhas e 3 colunas de números inteiros. Faça uma
validação de entrada de dados para aceitar somente números impares. Ao final da leitura escreva a
matriz resultante na tela.*/
#include<stdio.h>
#include<conio.h>
main()
{
	int m[5][3];
	int l,c;
	for (l=0; l<5; l++){
		for(c=0; c<3; c++){
			printf("\nComplete a matriz; linha %d coluna %d: ", l,c);
			do {
				scanf("%d", &m[l][c]);
				if (m[l][c] %2 == 0)
					printf("\nValor invalido, digite um valor impar: ");			
				}while (m[l][c] %2 == 0);
		}
	}
	printf("\nMATRIZ\n");
	for (l=0; l < 5; l++){
		for (c=0; c < 3; c++){
			printf("%d\t", m[l][c]);
		}
		printf("\n");
	}		
}
