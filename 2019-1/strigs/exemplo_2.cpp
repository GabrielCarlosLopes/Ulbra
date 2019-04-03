#include<string.h>
#include<stdio.h>
#include<conio.h>
main()
{
	char nome1[21], nome2[21];
	
	printf("\nNome 1:");
	gets(nome1);
	printf("\nNome 2:");
	gets(nome2);
	if (strcmp(nome1,nome2)==0){
		printf("\nNomes iguais");
	}
	else{
		printf("\nNomes Diferentes");
	}
}
