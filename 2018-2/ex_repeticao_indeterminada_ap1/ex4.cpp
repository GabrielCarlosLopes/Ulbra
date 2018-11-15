#include<stdio.h>
#include<conio.h>
main()
{
	int n,n2,division;
	do{
		printf("\nDigite um numero: ");
		fflush(stdin);
		scanf("%i", &n);
	}while(0>n);
	do{
		printf("\nDigite um numero maior que o primeiro: ");
		fflush(stdin);
		scanf("%i", &n2);
	}while(n<n2);
	division = n/n2;
	printf("%d / %d = %d", n, n2, division);
}
