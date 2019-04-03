#include<stdio.h>
#include<conio.h>
main()
{
	int M [3][4];
	int l=0, c=0;
	for (l=0; l < 3; l++){
		for (c=0; c < 4; c++){
			printf("\nComplete a matriz. Linha %d, Coluna %d:", l,c);
			scanf("%d", &M[l][c]);
		}
	}
	for (l=0; l < 3; l++){
		for (c=0; c < 4; c++){
			M[l][c]=M[l][c]*10;
		}
	}
	for (l=0; l < 3; l++){
		for (c=0; c < 4; c++){
			printf("%d\t", M[l][c]);
		}
		printf("\n");
	}
	
}
