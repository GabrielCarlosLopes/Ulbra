/*Escreva um programa em C para ler uma palavra. A seguir copie para outra variável a palavra
informada na ordem inversa. Imprimir a palavra copiada.
Exemplo:
Se a palavra informada for: BRASIL, a palavra copiada para a outra variável será LISARB.*/
#include<string.h>
#include<stdio.h>
#include<conio.h>
main()
{
	char palavra[21], palavraI[21];
	int i;
	printf("Digite uma palavra:");
	scanf("%s", palavra);
	strcpy(palavraI,palavra);
	strrev(palavraI);
	printf("\n%s", palavraI);
}
