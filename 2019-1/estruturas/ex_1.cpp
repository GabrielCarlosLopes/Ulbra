/*Uma escola deseja armazenar as seguintes informações
sobre os seus professores: Nome, endereço, telefone,
idade, sexo, titulação. Escreva um algoritmo que leia todas
estas informações de 20 professores.
As informações devem ser armazenadas em um vetor de
20 posições. Logo após a leitura deve ser informado o
número de professores do sexo masculino, a média das
idades de todos os professores e os nomes dos
professores q acima daue tem idade média.*/
#include<stdio.h>
#include<conio.h>
#include<string.h>
struct registro{
	char nome[50], endereco[50], sexo;
	int fone, idade, titulo;
};
main()
{
	int x, i, masc=0, somaidade=0;
	float mediaidade;
	char resp;
	struct registro professor[20];
	for (x=0; x<20; x++){
		printf("\nNome : ");
		gets(professor[x].nome);
		printf("\nSexo(f/m): ");
		scanf("%c", &professor[x].sexo);
		fflush(stdin);
		if (professor[x].sexo == 'm')
			masc++;
		printf("\nIdade: ");
		scanf("%d", &professor[x].idade);
		somaidade = professor[x].idade+somaidade;
		fflush(stdin);
		printf("\nEndereco: ");
		gets(professor[x].endereco);
		printf("\nFone: ");
		scanf("%d", &professor[x].fone);
		printf("\n\tTitulo");
		printf("\n[1]Professor Assistente");
		printf("\n[2]Professor Colaborador");
		printf("\n[3]Professor Doutor");
		printf("\n[4]Professor Titular\n");
		scanf("%d", &professor[x].titulo);
		fflush(stdin);
		printf("\nDeseja Incluir Outro(s/n)? ");
		scanf("%c", &resp);
		fflush(stdin);
		if (strchr("Nn", resp)){
			printf("\nLeitura Encerrada\n");
			break;
		}
	}
	if (x == 20)
		mediaidade = somaidade/x;
	else
		mediaidade = somaidade/(x+1);
	printf("\nNessa Leitura Foram Constados %d professeores do sexo masculino", masc);
	printf("\nMedia de idade dos professores: %.2f", mediaidade);
	printf("\n\tOs seguintes professores tem idade maior que a media");
	for (i=0; i<=x; i++){
		if (professor[i].idade>mediaidade){
			printf("\nNome: %s",professor[i].nome);
		}
	}
}	
