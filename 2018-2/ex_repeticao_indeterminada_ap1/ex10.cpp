#include<stdio.h>
#include<conio.h>
main()
{
	int idade,contador;
	float altura,media_altura,altura_total;
	char resp;
	do{
		printf("\nIdade: ");
		scanf("%i", &idade);
		printf("\nAltura: ");
		scanf("%f", &altura);
		printf("\nDeseja informar mais dados?(s/n)");
		fflush(stdin);
		scanf("%c", &resp);
		if (idade >= 30){
			altura_total = altura_total + altura;
			contador++;
		}
	}while(resp == 's');
	media_altura = altura_total/contador;
	printf("\naltura media das pessoas com mais de 30 anos : %.2f", media_altura);
}

