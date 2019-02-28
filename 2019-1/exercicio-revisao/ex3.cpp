#include<stdio.h>
#include<conio.h>
main()
{
	float morango,maca,p1,p2,somakg,valor=0,desconto;
	printf("\nQUNATOS KG DE MORANGO:\n");
	scanf("%f", &morango);
	printf("\nQUANTOS KG DE MAÇA: \n");
	scanf("%f", &maca);
	somakg=morango+maca;
	if (morango<=5)
		p1=morango*5;
	else
		p1=morango*4;
	if (maca<=5)
		p2=maca*3;
	else
		p2=maca*2;
	valor=p1+p2;
	if ((somakg>8) || (valor>35)){
		desconto=valor*0.25;
		valor=valor-desconto;
		printf("\nVALOR TOTAL: %.2f", valor);
	}
	else
		printf("\nVALOR TOTAL: %.2f", valor);
}
