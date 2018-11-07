#include<stdio.h>
#include<conio.h>
main()
{
	int x,num;
	printf("Digite um numero: ");
	scanf("%i", &num);
	for (x=1;x<=num;x++)
		{
		printf("\n%i", num+x);
		}
	getche();
}
