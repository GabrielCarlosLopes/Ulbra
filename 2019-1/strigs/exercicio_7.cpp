/*Fa�a um programa que leia o primeiro e o �ltimo nome de uma pessoa. O primeiro nome deve
ser armazenado em uma vari�vel e o �ltimo em outra. Uma terceira vari�vel deve ser criada
para armazenar o nome completo. Escreva a terceira vari�vel na tela.*/
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
