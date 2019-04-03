/*Escreva um programa em C para ler uma frase e uma letra. A seguir retirar da frase, todas as
letras iguais a informada. Imprimir a frase modificada.*/
#include<string.h>
#include<stdio.h>
#include<conio.h>
main()
{
	char letra, frase[200],Nfrase[200];
	int tam, i=0;
	printf("\nDigite uma frase:");
	gets(frase);
	printf("\nDigite uma letra qualquer:");
	scanf("%c", &letra);
	tam = strlen(frase);
	for (i=0; i <= tam; i++){
		if (frase[i] == letra){
			Nfrase[i] = ' ';
		}
		else{
			Nfrase[i]=frase[i];
		}
	}
	printf("\n %s", Nfrase);
}
