/*Faça um programa que leia o primeiro e o último nome de uma pessoa. O primeiro nome deve
ser armazenado em uma variável e o último em outra. Uma terceira variável deve ser criada
para armazenar o nome completo. Escreva a terceira variável na tela.*/
#include<string.h>
#include<stdio.h>
#include<conio.h>
main()
{
	char nome1[21],nome2[21],nomecompleto[50];
	printf("\nDigite seu primeiro nome:");
	gets(nome1);
	strcat(nomecompleto,nome1);
	printf("\nDigite seu sobrenome:");
	gets(nome2);
	strcat(nomecompleto,nome2);
	
	printf("\nNome: %s",nomecompleto);
	
}
