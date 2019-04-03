/*Escreva um programa que leia uma string, conte quantos caracteres desta string são iguais a 'a'
e substitua os que forem iguais a 'a' por 'b'. O programa deve imprimir o número de caracteres
modificados e a string modificada.*/
#include<string.h>
#include<stdio.h>
#include<conio.h>
main()
{
	char frase[50];
	int i,tam=0,cont=0;
	printf("\nDigite uma frase:");
	gets(frase);
	tam = strlen(frase);
	for (i=0; i <= tam; i++){
		if (frase[i] == 'a'){
			frase[i] = 'b';
			cont++;
		}
	}
	printf("\nForam alteras %d letras: ", cont);
	printf("\n%s", frase);
}
