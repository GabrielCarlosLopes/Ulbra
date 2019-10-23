using System;
using System.Collections;
using System.Collections.Generic;

namespace ProjetoCSharp
{
    class Program
    {

        public class ListClient {
            static void Main()
            {

                var client = new List<Cadastro>();
                while (true) {

                    Console.WriteLine("\n=====Cadastro de Clientes=====");
                    Console.WriteLine("\nEscolha uma Opcao");
                    Console.WriteLine("[1]INCLUIR");
                    Console.WriteLine("[2]ALTERAR");
                    Console.WriteLine("[3]CONSULTA");
                    Console.WriteLine("[4]LISTAR");
                    Console.WriteLine("[5]REMOVER");
                    Console.WriteLine("[6]SAIR");
                    Console.Write("\n===> ");
                    int menu = Int32.Parse(Console.ReadLine());
                    Console.Clear();

                    switch (menu) 
                    {
                        case 1:
                            Cadastro.AddClient(client);
                            break;
                        case 2:
                            Cadastro.AlterClient(client, Cadastro.PicName());
                            break;
                        case 3:
                            Cadastro.GetClientByName(client, Cadastro.PicName());
                            break;
                        case 4:
                            Cadastro.ListClients(client);
                            break;
                        case 5:
                            Cadastro.RemoveClient(client, Cadastro.PicName());
                            break;
                        case 6:
                            Console.WriteLine("\nPROGRAMA ENCERRADO");
                            Environment.Exit(0);
                            break;
                        default:
                            Console.WriteLine("\nOpcao invalida, escolha uma opcao do menu");
                            break;
                    }


                }
            }

        }
    }
}
