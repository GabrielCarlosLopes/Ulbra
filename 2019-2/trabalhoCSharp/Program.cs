using System;

namespace Trabalho
{
    class Program
    {
        static void Main(string[] args)
        {
            int menu;
            int quantidade = 0;
            int tam = 10;
            int codAlter;
            String nomeConsult;

   
            Cadastro[] lista = new Cadastro[tam];


            while (true)
            {
                Console.WriteLine("\n=====Cadastro de Clientes=====");
                Console.WriteLine("\nEscolha uma Opcao");
                Console.WriteLine("[1]INCLUIR");
                Console.WriteLine("[2]ALTERAR DADOS POR CODIGO");
                Console.WriteLine("[3]CONSULTA POR NOME");
                Console.WriteLine("[4]LISTAR");
                Console.WriteLine("[5]SAIR");
                menu = Int32.Parse(Console.ReadLine());
                Console.Clear();

                switch (menu)
                {
                    case 1:
                        Cadastro cadastro = new Cadastro();
                        cadastro.ler();
                        lista[quantidade] = cadastro;
                        quantidade++;
                        break;
                    case 2:
                        Console.WriteLine("\nDIGITE O CODIGO REFERENTE AO QUE DESEJA ALTERAR: ");
                        codAlter = Int32.Parse(Console.ReadLine());

                        for (int i = 0; i < quantidade; i++)
                        {
                            if (codAlter.Equals(lista[i].Codigo))
                            {
                                Cadastro cadastro1 = new Cadastro();
                                cadastro1.ler();
                                lista[i] = cadastro1;
                            }
                        }
                        break;

                    case 3:
                        Console.WriteLine("\nDIGITE O NOME QUE DESEJA PROCURAR: ");
                        nomeConsult = Console.ReadLine();

                        Cadastro.consultar(lista, nomeConsult);
                        break;
                    case 4:
                        Cadastro.mostrar(lista);
                        break;
                    case 5:
                        Console.WriteLine("\nPROGRAMA ENCERRADO");
                        Environment.Exit(0);
                        break;
                    default:
                        Console.WriteLine("\nOPCAO INVALIDA");
                        break;
                }
            };
        }
    }
}
