#include<stdio.h>
#include<conio.h>
main()
{
	char nome[5][20];
	float m[5][2], notas[5], maiornota=0, menornota=10, mediaturma=0;
	int l,c,cont=1;
	
	printf("\n\t\t====CADASTRO DE NOTAS DO SEMESTRES====\n");
	for(l=0; l<5; l++){
		printf("\nDigite o nome do aluno: ");
		scanf("%s", nome[l]);
		cont = 1;
		for(c=0; c<2; c++){
			printf("Digite as notas do aluno %s na G%d : ", nome[l], cont);
			do{
			scanf("%f", &m[l][c]);
			}while((m[l][c] < 0) || (m[l][c] >10));
			cont++;
		}
	}
	
	printf("\n\t\t====NOTAS====\n");
	for (l=0; l < 5; l++){
		printf("Notas do aluno %s: ", nome[l]);
		for (c=0; c < 2; c++){
			printf("%2.f\t", m[l][c]);
		}
		printf("\n");
	}
	
	for (l=0; l < 5; l++){
		for (c=0; c < 2; c++){
			notas[l] += m[l][c]/2;
		}
		if (notas[l] > maiornota){
				maiornota = notas[l];
			}
		if (notas[l] < menornota){
			menornota = notas[l];
		}
	}
	
	
	printf("\n\t\t====MEDIA FINAL====\n");
	for (l=0; l < 5; l++){
		printf("\nNotas do aluno %s: ", nome[l]);
		printf("%.2f", notas[l]);
			if (notas[l] >= 6){
				printf(" APROVADO");
			}
			else{
				printf(" REPROVADO");
			}
	}

	for(l=0; l<5; l++){
		mediaturma = (notas[l]+mediaturma);
	}
	
	mediaturma = mediaturma/5;
	printf("\n");
	printf("\n\t\t======A maior nota foi %.2f======\n", maiornota);
	printf("\n\t\t======A menor nota foi %.2f======\n", menornota);
	printf("\n\t\t======A media foi %.2f======\n", mediaturma);
}
