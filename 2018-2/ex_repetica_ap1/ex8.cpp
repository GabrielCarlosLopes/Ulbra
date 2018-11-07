#include <stdio.h> 


 main() { 
	int num, x, cont=0; 

	for (x=1; x<=10; x++) { 
		printf ("Informe um numero: "); 
		scanf("%d", &num); 
		if (num < 0) 
		cont++; 
}
 
	printf("\n%d numeros negativos\n", cont); 
	return 0; 
} 

