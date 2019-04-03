#include <stdio.h>
#include <stdlib.h>
main() 
{
	int vetor[30], vetorpar[5], vetorimpar[5]; 
	int cont=0, num=0, contpar=0, contimpar=0, contaux=0;
	for (cont = 0; cont < 30; cont++){
		printf("\nNumero: ");
		scanf("%d", &vetor[cont]);
		if (vetor[cont] %2 == 0){
			vetorpar[contpar]=vetor[cont];
			contpar++;
		if (contpar == 5){
			printf("\nNumeros Pares em Um Conjunto de 5\n");
		for (contaux = 0; contaux < 5; contaux++){
			printf("%d\n", vetorpar[contaux]);
		}
		contpar = 0;
		}
		}
	else{
		vetorimpar[contimpar] = vetor[cont];
		contimpar++;
		if (contimpar == 5){
			printf("\nNumeros Impares em Um Conjunto de 5\n");
			for(contaux = 0; contaux < 5; contaux++){
				printf("%d\n", vetorimpar[contaux]);
			}
			contimpar = 0;
		}
	}
	}
	printf("\nOs Numeros Digitados Foram\n");
	for(cont = 0; cont < 30; cont++){
		printf("\n%d\n", vetor[cont]);
	}
}
