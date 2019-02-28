#include<stdio.h>
#include<conio.h>
main()
{
	float preco=0;
	int macas;
	printf("\nNUMERO DE MAÇAS COMPRADAS:");
	scanf("%d", &macas);
	if (macas >= 12)
	{
		preco = macas * 0.25;
		printf("\nVALOR A PAGAR R$: %2.f", preco);
	}
	else
	{
		preco = 0.30 * macas;
		printf("\nVALOR A PAGAR R$: %2.f", preco);
	}
}
