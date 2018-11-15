#include<stdio.h>
#include<conio.h>
main()
{
	int x;
	do
	{
	printf("\nEscolha uma cor");
	printf("\n1- Azul");
	printf("\n2- Preto");
	printf("\n3- Rosa");
	printf("\n4- Vermelho");
	scanf("\n%i", &x);
	if (x>4){
		printf("\nerro");
	}
	}while(x>4);
	getche();
}
