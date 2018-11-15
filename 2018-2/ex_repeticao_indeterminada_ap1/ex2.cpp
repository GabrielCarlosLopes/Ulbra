#include<stdio.h>
#include<conio.h>
main()
{
	int x,s;
	printf("\nDigite um numero: ");
	scanf("%i", &x);
	while (x >= 1){
		s=(x-1);
		printf("\n%i - 1 = %i",x,s);
		break;
	}
	getch();
}
