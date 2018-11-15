#include<stdio.h>
#include<conio.h>
main()
{
	char x;
	printf("\npressione uma tecla: ");
	scanf("%c", &x);
	while (x!='w')
	{
		printf("\npressione uma tecla: ");
		fflush(stdin);
		scanf("%c", &x);
			if (x == 'w')
			{
				printf("\nFim da execucao");
				break;
			}
	}
}
