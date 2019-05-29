#include<stdio.h>
int absoluto (int n)
{
	if(n<0){
		return n*-1;
	}
	return n;
}
main()
{
	int numero,i;
	for (i=1; i<=5; i++){
		printf("\nDigite o %d numero: ", i);
		scanf("%d", &numero);
		printf("\nValor absoluto: %d\n", absoluto(numero));
	}
}
