#include<stdio.h>
#include<conio.h>
main()
{
	float n1,n2,desconto;
	printf("\nValor do produto: ");
	scanf("%f", &n1);
	printf("\nPorcentagem do Desconto: ");
	scanf("%f", &n2);
	
	desconto = n1-(n1*n2/100);
	
	printf("\nO valor sera: = %.2f", desconto);
	getche();
}
