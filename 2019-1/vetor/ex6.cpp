#include<stdio.h>
#include<conio.h>
main()
{
	int vetor[10],cont,n1;
	printf("\nDigite um numero inteiro: ");
	scanf("%d", &n1);
	printf("\nPreencha o vetor:\n");
	
	for (cont=0; cont<10; cont++){
		scanf("%d", &vetor[cont]);
		}
	printf("\nOs seguintes numeros do vetor coincidem com o numero digitado:\n ");
	for (cont=0; cont<10; cont++){
		if (vetor[cont]=n1){
			printf("%d\n", vetor[cont]);
			break;
		}
	}
}
