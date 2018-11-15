#include<stdio.h>
#include<conio.h>
main()
{
	float num;
	int cont=0;
	printf("\ndigite um nuemro: ");
	scanf("%f", &num);
	do{
		printf("\n%.2f / 2", num);
		num = num / 2;
		cont++;
	}while(num>=1);
	printf("\n\nResultado da Ultima Divisao: %.2f", num);
	printf("\n\nO Numero Foi Dividido %d Vezes", cont );
}
