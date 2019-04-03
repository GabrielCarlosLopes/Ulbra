#include<stdio.h>
#include<conio.h>
main()
{
	int i, x, j, r[5], a[10], total_pontos = 0;
	 
	printf("\tGABARITO\n");
	for (i = 0; i < 5; i++){
		scanf("%d", &r[i]);
	}
	printf("\n\tAPOSTA\n");
	for (i = 0; i < 10; i++){
		scanf("%d", &a[i]);
	} 
	for (i = 0; i < 5; i++){
		for (j = 0; j < 10; j++){
			if (a[j] == r[i])
			total_pontos++;
		}
	}
	printf("ACERTOS: %d\n", total_pontos);
}
