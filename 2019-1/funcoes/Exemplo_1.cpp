#include<stdio.h>
int soma (int num1, int num2)
{
	int result;
		result = num1 + num2;
		return (result);
}
main()
{
	int n1,n2,r;
	printf("\nDigite um numero: ");
	scanf("%d", &n1);
	printf("\nDigite outro numero: ");
	scanf("%d", &n2);
	//r = soma (n1,n2);
	//printf("\nSoma = %d, r);
	printf("\nSoma = %d", soma(n1,n2));
}
