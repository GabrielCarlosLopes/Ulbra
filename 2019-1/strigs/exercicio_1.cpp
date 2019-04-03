/*Escreva um programa em C para ler uma palavra e escrever:
-A primeira letra da palavra.
-A última letra da palavra.
-O número de letras existente na palavra.*/

#include<string.h>
#include<stdio.h>
#include<conio.h>
main()
{
	char palavra[21];
	int tam;
	printf("\nDigite Uma Palavra: ");
	scanf("%s", palavra);
	tam=strlen(palavra);
	
	printf("\nEsta Palavra Contem %d Letras", tam);
	printf("\nA primeira letra Desta Palavra:%c ",palavra[0]);
	printf("\nA Ultima Letra Desta Palavra:%c", palavra[tam-1]);
}
