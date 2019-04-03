#include<string.h>
#include<stdio.h>
#include<conio.h>
main()
{
	char paragrafo[50];
	int tam, cont=0, i;
	
	printf("\nDigite um Paragrafo de ate 50 caracteres:");
	gets(paragrafo);
	tam = strlen(paragrafo);
	for(i=0; i < tam; i++){
		if (paragrafo[i] == ' '){
			cont++;
		}
	}
	printf("\nO Paragrafo Tem %d Espacos", cont);
	printf("\nVoce Digitou %d Caracteres", tam);
	printf("\nVoce Digitou %d Letras ou Simbolos", tam-cont);
}
