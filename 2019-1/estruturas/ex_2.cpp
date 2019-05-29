/*Crie um programa que permita cadastrar 40
clientes (código, nome, endereço, telefone e e-
mail). O programa deve ler todos os clientes e
depois ler um nome. Para o nome lido escrever na
tela todos dos dados(código, endereço, telefone e
email). Caso o nome não seja encontrado, o
programa deve escrever na tela "cliente não
cadastrado”.*/
#include<stdio.h>
#include<conio.h>
#include<string.h>
struct cadastro{
	int cod;
	char nome[50], endereco[50], telefone[12], email[100];
};
main()
{
	int x,i,ncliente=0;
	char resp, leitura[50];
	struct cadastro cliente[40];
	for (x=0; x<40; x++){
		ncliente++;
		printf("\n\tCadastro Cliente");
		printf("\nNome: ");
		gets(cliente[x].nome);
		printf("\nCodigo: ");
		scanf("%d", &cliente[x].cod);
		fflush(stdin);
		printf("\nEndereco: ");
		gets(cliente[x].endereco);
		printf("\nTelefone: ");
		gets(cliente[x].telefone);
		printf("\nEmail: ");
		gets(cliente[x].email);
		printf("\nDeseja Incluir Outro(s/n)? ");
		scanf("%c", &resp);
		fflush(stdin);
		if (strchr("Nn", resp)){
			printf("\nLeitura Encerrada\n");
			break;
		}
	}
	printf("\n\tBusca de Clientes\n");
	printf("\nDigite o Nome do Cliente: ");
	gets(leitura);
	for (i=0; i<=x; i++){
		if (strcmp(leitura, cliente[i].nome)==0){
			printf("\nNome: %s", cliente[i].nome);
			printf("\nCodigo: %d", cliente[i].cod);
			printf("\nEndereco: %s", cliente[i].endereco);
			printf("\nTelefone: %s", cliente[i].telefone);
			printf("\nEmail: %s", cliente[i].email);
		}
	}
}
