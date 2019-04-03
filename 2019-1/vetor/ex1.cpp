#include<stdio.h>
#include<conio.h>
main()
{

    int A[10], valor, cont;
    printf("Preencha o vetor.\n");

    for (cont = 0; cont < 10; cont++){
		scanf("%d", &A[cont]);
    }
    printf("Digite um valor:\n");
    scanf("%d",&valor);
	for(cont = 0; cont < 10; cont++){
        if(valor == A[cont]){
        	printf("ACHEI\n");
            break;
        }
		if((cont == 9) && (valor != A[9])){
            printf("NAO ACHEI\n");
            break;
            }
    }
}
