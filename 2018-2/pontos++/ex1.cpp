#include<stdio.h>
#include<conio.h>
main()
{
	int voto=0,cand1=0,cand2=0,cand3=0,cand4=0,branco=0;
	while (voto < 6){
		printf("\nELEICOES");
		printf("\n[1]Cand1");
		printf("\n[2]Cand2");
		printf("\n[3]Cand3");
		printf("\n[4]Cand4");
		printf("\n[5]Branco");
		printf("\n\nQual seu voto: ");
		scanf("%i", &voto);
		if (voto == 1){
			cand1=cand1+1;
		}
		if (voto == 2){
			cand2=cand2+1;
		}
		if (voto == 3){
			cand3=cand3+1;
		}
		if (voto == 4){
			cand4=cand4+1;
		}
		if (voto == 5){
			branco=branco+1;
		}
	}
	printf("\n\nTOTAL DE VOTO PARA O CAND1 FOI: %d", cand1);
	printf("\n\nTOTAL DE VOTO PARA O CAND2 FOI: %d", cand2);
	printf("\n\nTOTAL DE VOTO PARA O CAND3 FOI: %d", cand3);
	printf("\n\nTOTAL DE VOTO PARA O CAND4 FOI: %d", cand4);
	printf("\n\nTOTAL DE VOTOS EM BRANCO FOI: %d", branco);
}
