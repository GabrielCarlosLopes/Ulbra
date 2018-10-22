#include<stdio.h>
#include<conio.h>
main()
{
	float n1,n2,n3,p1,p2,p3,media;

	printf("\nDigite a primeira nota: ");
	scanf("%f", &n1);
	printf("\nPeso da primeira: ");
	scanf("%f", &p1);
	printf("\nDigite a segunda nota: ");
	scanf("%f", &n2);
	printf("\nPeso da segunda: ");
	scanf("%f", &p2);
	printf("\nDigite a terceira nota: ");
	scanf("%f", &n3);
	printf("\nPeso da terceira: ");
	scanf("%f", &p3);
	
	media = (n1*p1+n2*p2+n3*p3)/(p1+p2+p3);
	
	printf("\nMedia = %.2f",media);
}

