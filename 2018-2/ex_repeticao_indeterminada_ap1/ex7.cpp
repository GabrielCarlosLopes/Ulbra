#include<stdio.h>
#include<conio.h>
main()
{
	int numero=0, resultado=0;  
	
	printf ("\nDigite o numero:"); 
	scanf ("%d", &numero);  
    do
	{ 
    	resultado=resultado+numero; 
    	numero=numero-1; 
    }while(numero>=0); 
    printf("%d", resultado); 
 
}
