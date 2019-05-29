#include<stdio.h>
int maior_valor (int num1, int num2)
{
	if (num1 == num2){
		return -1;
	}
	else{
		if(num1 > num2){
			return num1;
		}
		else{
			return num2;
		}
	}
}
main()
{
	int n1, n2, i;
	for (i=0; i<5; i++){
		printf("\nDigite um numero positivo: ");
		scanf("%d", &n1);
		printf("\nDigite mais um numero: ");
		scanf("%d", &n2);
		printf("\n %d", maior_valor(n1,n2));
	}
}
