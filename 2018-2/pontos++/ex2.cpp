#include<stdio.h>
#include<conio.h>
main()
{
	float altura=0;
	int idade;
	do{
	printf("\n\nNADADOR");
	printf("\n\nDIGITE A ALTURA: ");
	scanf("%f", &altura);
	if (altura <1.60 || altura >1.90){
		printf("\nALTURA INVALIDA");
		printf("\nDIGITE UMA NOVA ALTURA");
	}
	}while((altura < 1.60) || (altura > 1.90)) ;
	printf("\nIDADE: ");
	scanf("%i", &idade);
	if (idade < 8){
		printf("\nIDADE FORA DA COMPETICAO");
	}
	if (idade > 7 && idade < 11){
		printf("\n\nCATEGORIA INFANTIL");
	}
	if (idade > 10 && idade < 18){
		printf("\nCATEGORIA JUVENIL A");
	}
	if (idade > 13 && idade < 18){
		printf("\nCATEGORIA JUVENIL B");
	}
	if (idade > 17){
		printf("\nCATEGORIA ADULTO");
	}
}
