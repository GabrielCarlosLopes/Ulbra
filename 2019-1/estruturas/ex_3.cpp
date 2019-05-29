/*Crie um programa que permita cadastrar at� 40 clientes (c�digo, nome, endere�o,
telefone e e-mail). O programa deve permiJr as opera��es: inclus�o, altera��o por
c�digo, consulta por nome e listar(relat�rio). O seguinte menu deve ser apresentado ao
usu�rio:
========Cadastro de Clientes========
Escolha uma op��o:
1 - Incluir
2 - Alterar dados por c�digo
3 - Consultar por nome
4 - Listar
=>
O programa deve permiJr o cadastro de no m�ximo 40 clientes. Ap�s cada inclus�o, o
programa deve perguntar, �Deseja nova inclus�o(s/n)?�. Caso o usu�rio n�o queira
incluir mais clientes, a inclus�o deve ser encerrada. Ap�s as inclus�es, deve ser impresso
na tela o n�mero de clientes cadastrados. O programa deve retornar ao menu inicial
permiJndo as opera��es de incluir, alterar por c�digo, consultar por nome e listar.
Importante: se o usu�rio escolher novamente a op��o de Incluir, nenhum dado pode ser
sobrescrito. Cada novo cliente deve ser cadastrado na sequencia (ap�s o anterior). Para
tanto, ser� necess�rio uma vari�vel que indique o numero de elementos no vetor.
Para a op��o de relat�rio todos os clientes cadastrados devem ser listados.*/
#include<stdio.h>
#include<conio.h>
#include<string.h>
#include<stdlib.h>
struct cadastro{
	int codigo;
	char nome[50], endereco[50], telefone[20], email[200];
};
main()
{
	int x,i=0, menu,ncliente=0, codalter;
	char resp, leitura[50];
	struct cadastro cliente[40];
	while(true){
		printf("\n=========Cadastro de Clientes=========");
		printf("\nEscolha uma Opcao: ");
		printf("\n[1]Incluir");
		printf("\n[2]Alterar Dados por Codigo");
		printf("\n[3]Consulta por Nome");
		printf("\n[4]Listar");
		printf("\n[5]Sair");
		printf("\n===>");
		scanf("%d", &menu);
		fflush(stdin);
		switch (menu){
			case 1:
				for (x=ncliente; x<40; x++){
					printf("\n\tCadastro Cliente");
					printf("\nNome: ");
					gets(cliente[x].nome);
					printf("\nCodigo: ");
					scanf("%d", &cliente[x].codigo);
					fflush(stdin);
					printf("\nEndereco: ");
					gets(cliente[x].endereco);
					printf("\nTelefone: ");
					gets(cliente[x].telefone);
					printf("\nEmail: ");
					gets(cliente[x].email);
					ncliente++;
					printf("\nDeseja Uma Nova Inclusao(s/n)? ");
					scanf("%c", &resp);
					fflush(stdin);
					if (strchr("Nn", resp)){
						printf("\nNumero de Cliente cadastrados: %d\n", ncliente);
						fflush(stdin);
						break;
					}
				}
				break;
			case 2:
				printf("\n\tAlteracao de Dados por Codigo");
				printf("\nDigite o codigo: ");
				scanf("%d", &codalter);
				fflush(stdin);
				for(i=0; i<=x; i++){
					if (codalter == cliente[i].codigo){
						printf("\nNome: ");
						gets(cliente[i].nome);
						printf("\nCodigo: ");
						scanf("%d", &cliente[i].codigo);
						fflush(stdin);
						printf("\nEndereco: ");
						gets(cliente[i].endereco);
						printf("\nTelefone: ");
						gets(cliente[i].telefone);
						printf("\nEmail: ");
						gets(cliente[i].email);
					}
				}
				break;
			case 3:
				printf("\nDigite o Nome do Cliente: ");
				gets(leitura);
				fflush(stdin);
				for (i=0; i<=x; i++){
					if (strcmp(leitura, cliente[i].nome)==0){
						printf("\nNome: %s", cliente[i].nome);
						printf("\nCodigo: %d", cliente[i].codigo);
						printf("\nEndereco: %s", cliente[i].endereco);
						printf("\nTelefone: %s", cliente[i].telefone);
						printf("\nEmail: %s", cliente[i].email);
					}
				} 
				break;
			case 4:
				for (i=0; i<=x; i++){
					printf("\nNome: %s", cliente[i].nome);
					printf("\nCodigo: %d", cliente[i].codigo);
					printf("\nEndereco: %s", cliente[i].endereco);
					printf("\nTelefone: %s", cliente[i].telefone);
					printf("\nEmail: %s\n", cliente[i].email);
				}
				break;
			case 5:
				exit(0);
				break;
			default: 
				printf("\n\tERRO");
				break;
		}
	}
	
}
