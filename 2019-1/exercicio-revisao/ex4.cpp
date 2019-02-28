#include<stdio.h>
#include<conio.h>
main()
{
	float nota, media, n1, n2, n3, n4;
	printf("\nNOTA UM: ");
	scanf("%f", &n1);
	printf("\nNOTA DOIS: ");
	scanf("%f", &n2);
	printf("\nNOTA TRES: ");
	scanf("%f", &n3);
	printf("\nNOTA QUATRO: ");
	scanf("%f", &n4);
	media = (n1 + n2 * 2 + n3 * 3 + n4)/7;
	if (media >= 9.0){
		printf("\nA");
	}
	if ((media >=7.5) && (media<9)){
		printf("\nB");
	}
	if ((media>=6) && (media<7.5)){
		printf("\nC");
	}
	if (media<6){
		printf("\nD");
	}
}
