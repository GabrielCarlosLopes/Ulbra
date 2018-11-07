#include<stdio.h>
#include<conio.h>
main()
{
	int x, numero;
	printf("\nDigite um numero: ");
	scanf("%i", &numero);
	for (x=1;x<=10;x++){
		printf("%i\n", numero);
	}
	getche();
}
