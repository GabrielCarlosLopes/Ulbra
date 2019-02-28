#include<stdio.h>
#include<conio.h>
main()
{
	int pessoas, quarto;
	float valor;
	printf("\n\tESCOLHA O TIPO DE QUARTO");
	printf("\n 1- SUTITE");
	printf("\n 2- QUARTO DE LUXO");
	printf("\n 3- QUARTO CONJUGADO");
	printf("\n 4- QUARTO STANDART\n\n");
	scanf("%d", &quarto);
	printf("\nNUMERO DE PESSOAS: ");
	scanf("%d", &pessoas);
	switch (quarto)
	{
		case 1 : 
			valor=180.00*pessoas;
			printf("\nVALOR TOTAL DA DIARIA: %.2f", valor);
			break;
		case 2 :
			valor=150.00*pessoas;
			printf("\nVALOR TOTAL DA DIARIA: %.2f", valor);
			break;
		case 3 :
			valor=130.00*pessoas;
			printf("\nVALOR TOTAL DA DIARIA: %.2f", valor);
			break;	
		case 4 :
			valor=100.00*pessoas;
			printf("\nVALOR TOTAL DA DIARIA: %.2f", valor);
			break;
		default	:
			printf("\n\tQUARTO NAO ENCONTRADO");	
	}
	getch();
    return 0;

}
