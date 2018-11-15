#include<stdio.h>
#include<conio.h>
main()
{
	int senha=0;
	do{
		printf("\nDigite a Senha: ");
		scanf("%i", &senha);
		if (senha!= 2016){
			printf("ACEESO NEGADO");
		}
	}while(senha != 2016);
		printf("ACESSO PERMITIDO");
}
