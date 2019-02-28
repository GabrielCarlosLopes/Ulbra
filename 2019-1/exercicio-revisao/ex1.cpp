#include<stdio.h>
#include<conio.h>
main()
{
	int idade;
	printf("\nQUAL SUA IDADE? ");
	scanf("%d", &idade);
		if (idade<16)
			printf("\nNao pode votar");
		else	
			if ((idade>=16) && (idade<18) || (idade>60))
				printf("\nVoto nao obrigatorio");
			else
				printf("\nObrigado a votar");
}
