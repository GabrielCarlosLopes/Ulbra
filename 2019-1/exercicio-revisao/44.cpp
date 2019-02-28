#include<stdio.h>
#include<conio.h>

main()
{
	int num=0,positivo=0,cont=0;
	do{
		printf("\nDIGITE UM NUMERO: ");
		scanf("%d", &num);
		if (num>=0)
			positivo=positivo+num;
		if (num<0)
			cont++;	
	}while(num!=0);
	printf("\nA SOMA DE TODOS NUMEROS POSITIVOS DIGITADOS FOI DE %d", positivo);
	printf("\n\nFORAM DIGITADOS %d NUMEROS NEGATIVOS", cont);
}
