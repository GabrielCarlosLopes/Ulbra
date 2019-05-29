#include<stdio.h>
void positivo(int numero)
{
	if (numero > 0)
		printf("\nPositivo");
}
main()
{
	int num, i;
	for (i=0; i<5; i++){
		printf("\nDigite um numero: ");
		scanf("%d", &num);
		positivo(num);
	}
}
