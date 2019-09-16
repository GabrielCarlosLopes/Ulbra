#include <stdio.h>
#include <stdlib.h>
#include<string.h>

#define MAX 100

struct cadastroAlunos{
	int codigo;
	char nome[20], email[100], telefone[12];
	float g1, g2;
};
typedef struct cadastroAlunos Nodo;

struct lista {
	int finalList;
	Nodo dado[MAX];
};
typedef struct lista Lista;

//CRIA A LISTA
Lista* Create_List(void)
{
	Lista* LT = (Lista*)malloc(sizeof(Lista));
	if(LT != NULL)
		LT->finalList = 0;
	return LT;
}

//COLOCA UM ELEMENTO NA ULTIMA POSICAO
Lista* Insert_Element_Final(Lista* Ptl,  Nodo c)
{
	if (Ptl == NULL || Ptl->finalList == MAX){
		printf("\nLISTA JA CHEI\n");
	} else {
		Ptl->dado[Ptl->finalList] = c;
		Ptl->finalList++;
		printf("\nCADASTRO CONCLUIDO COM SUCESSO\n");
		return Ptl;
	}
}

//COLOCA UM ELEMENTO NA PRIMEIRA POSICAO
Lista* Insert_Element_Initial(Lista* Ptl, Nodo c)
{
	if (Ptl->finalList == 0){
		Ptl->dado[0] = Ptl->dado[0] = c;
		Ptl->finalList++;
 		printf("\nCADASTRO CONCLUIDO COM SUCESSO");
 		return Ptl;
	}else{
		for (int x=Ptl->finalList; x>0; x--){
	  		Ptl->dado[x] = Ptl->dado[x-1];
	 	}
	 	Ptl->dado[0] = Ptl->dado[0] = c;
	 	Ptl->finalList++;
	 	printf("\nCADASTRO CONCLUIDO COM SUCESSO");
	 	return Ptl;
	}
}

//EXCLUIR O PRIMEIRO ELEMENTO
Lista* deleteInitial(Lista* Ptl)
{
	for (int x=0; x<Ptl->finalList; x++){
  		Ptl->dado[x] = Ptl->dado[x+1];
 	}
 	printf("\nPRIMEIRO ELEMENTO EXCLUIDO COM SUCESSO\n");
 	Ptl->finalList--;
 	return Ptl;
}

//EXCLUIR O ULTIMO ELEMENTO
Lista* deleteFinal(Lista* Ptl)
{
	for (int x=0; x>Ptl->finalList; x--){
  		Ptl->dado[x] = Ptl->dado[Ptl->finalList-1];
 	}
 	printf("\nULTIMO ELEMENTO EXCLUIDO COM SUCESSO\n");
 	Ptl->finalList--;
	return Ptl;
}


//CONSULTA POR NOME DO ALUNO
void consultName (Lista* Ptl, char nome[]){
	for(int i=0; i<Ptl->finalList; i++){
		if (strcmp (Ptl->dado[i].nome ,nome)==0){
			printf("\nCodigo: %d", Ptl->dado[i].codigo);
			printf("\nNome: %s", Ptl->dado[i].nome);
			printf("\nEmail: %s", Ptl->dado[i].email);
			printf("\nTelefone: %s", Ptl->dado[i].telefone);
			printf("\nNota de G1: %.2f", Ptl->dado[i].g1);
			printf("\nNota de G2: %.2f\n", Ptl->dado[i].g2);
		}
	}
}


//MOSTRA O NOME E A MEDIA FINAL DO ALUNO
void showAverage (Lista* Ptl){
	for(int x=0; x<Ptl->finalList; x++){
		printf("\n Nome: %s || Media Final: %.2f", Ptl->dado[x].nome, (Ptl->dado[x].g1+Ptl->dado[x].g2)/2);
	}
	printf("\n");
}

//INSERE UM ELEMENTO APOS A LEITURA DE UM NOME
Lista* insertAfterName(Lista* Ptl, char nome[], Nodo c ){
	for(int i=0; i<Ptl->finalList; i++){
		if (strcmp (Ptl->dado[i].nome ,nome)==0){
			for (int x=Ptl->finalList; x>i; x--){
				Ptl->dado[x] = Ptl->dado[x-1];
			}
			Ptl->dado[i+1] = Ptl->dado[i+1] = c;
		 	Ptl->finalList++;
		 	return Ptl;
		}
	}
}

//DELETA UM ELEMENTO A PARTIR DE UM CODIGO
Lista* deleteCod(Lista* Ptl, int cod){
	for(int x=0; x<Ptl->finalList; x++){
		if (cod == Ptl->dado[x].codigo){
			for(int i=x; i<Ptl->finalList-1; i++){
				Ptl->dado[i] = Ptl->dado[x+1];
			}
			Ptl->finalList--;
		 	return Ptl;
		}
	}
}

//MOSTRA A LISTA
Lista* View_List(Lista* Ptl){
	int i;
	for(i = 0; i < Ptl->finalList; i++){
		printf("\n===================================================\n");
		printf("\nCodigo: %d", Ptl->dado[i].codigo);
		printf("\nNome: %s", Ptl->dado[i].nome);
		printf("\nEmail: %s", Ptl->dado[i].email);
		printf("\nTelefone: %s", Ptl->dado[i].telefone);
		printf("\nNota de G1: %.2f", Ptl->dado[i].g1);
		printf("\nNota de G2: %.2f\n", Ptl->dado[i].g2);
	} 
}
//Le um aluno
void leNodo(Nodo* cadastro)
{
	printf("\nCodigo: ");
	scanf("%d", &cadastro->codigo);
	fflush(stdin);
	printf("\nNome: ");
	gets(cadastro->nome);
	printf("\nEmail: ");
	gets(cadastro->email);
	printf("\nTelefone: ");
	gets(cadastro->telefone);
	printf("\nNota de G1:");
	scanf("%f", &cadastro->g1);
	fflush(stdin);
	printf("\nNota de G2:");
	scanf("%f", &cadastro->g2);
	fflush(stdin);
}


main(){
	int op, cod;
	char nome[25];
	Lista* Ptl;
	Nodo cadastro;
	
	while(true){
		printf("\n[1]-CRIAR LISTA");
		printf("\n[2]-INCLUIR NO FINAL");
		printf("\n[3]-INCLUIR NO INICIO");
		printf("\n[4]-INCLUIR APOS UM NOME");
		printf("\n[5]-CONSULTAR POR NOME");
		printf("\n[6]-EXCLUIR NO INICIO");
		printf("\n[7]-EXCLUIR NO FIM");
		printf("\n[8]-EXCLUIR POR CODIGO");
		printf("\n[9]-LISTAR TODOS OS RESGISTROS");
		printf("\n[10]-LISTAR MEDIAS FINAIS");
		printf("\n[11]-SAIR");
		printf("\nOPCAO===> ");
		scanf("%d", &op);
		system("cls");
		fflush(stdin);
		
		switch(op){
			case 1:
				Ptl = Create_List();
				printf("\n-----------------------");
				printf("\n|                     |");
				printf("\n|    LISTA CRIADA     |");
				printf("\n|                     |");
				printf("\n-----------------------");
				break;
			
			case 2:
				printf("\nCADASTRO DO ALUNO NO FINAL DA LISTA");
				leNodo(&cadastro);
				Insert_Element_Final(Ptl, cadastro);
				break;
				
			case 3:
				printf("\nCADASTRO DO ALUNO NO INICIO DA LISTA");
				leNodo(&cadastro);
				Insert_Element_Initial(Ptl, cadastro);
				break;
			case 4:
				printf("\nINCLUIR APOS UM NOME");
				printf("\nDigite o nome: ");
				gets(nome);
				leNodo(&cadastro);
				insertAfterName(Ptl, nome, cadastro);
				break;
			case 5:
				printf("\nCONSUTAR POR NOME");
				printf("\nDigite o nome: ");
				gets(nome);
				consultName(Ptl, nome);
				break;
			case 6:
				deleteInitial(Ptl);
				break;
			case 7:
				deleteFinal(Ptl);
				break;
			case 8:
				printf("\nEXCLUIR POR CODIGO");
				printf("\nDigite o codigo: ");
				scanf("%d", &cod);
				deleteCod(Ptl, cod);
				break;
			case 9:
				View_List(Ptl);
				break;
			case 10:
				showAverage(Ptl);
				break;
			case 11:
				printf("\nPROGRAMA ENCERRADO");
				exit(0);
				break;
			default:
				printf("\nOPCAO INVALIDA, DIGITE UMA OPCAO DO MENU");
		}
	}
}
