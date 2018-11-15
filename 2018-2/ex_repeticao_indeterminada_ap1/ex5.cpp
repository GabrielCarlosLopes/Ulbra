#include<stdio.h>
#include<conio.h>
main()
{
	int contador;
	float salario,salario_total=0,salario_media;
	char resp;
	do
	{
		printf("\nDigite o salario: ");
		scanf("%f", &salario);
		printf("\nDeseja continuar?(s/n) ");
		fflush(stdin);
		scanf("%c", &resp);
		salario_total = (salario+salario_total);
		contador++;
	}while(resp=='s');
	salario_media = (salario_total/contador);
	printf("\nMedia de salario: %2.f ", salario_media);
	getch();
	
}

