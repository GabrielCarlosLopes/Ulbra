/*Escreva um programa em C para ler uma frase e imprimir o número de caracteres dessa frase
(não utilizar a função strlen)*/
#include<string.h>
#include<stdio.h>
#include<conio.h>
main()
{
	char frase[1000];
	int i=0;
	
	printf("\nEscreva uma frase:");
	gets(frase);
	do {
        ++i;
    } while (frase[i] != '\0');

	printf("\nEsta frase contem %i caracteres", i);
}
