using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.Linq;

namespace ProjetoCSharp
{
    class Cadastro
    {
        private string name;
        private string email;
        private string number;


        public Cadastro(string a, string b, string c)
        {
            this.name = a;
            this.email = b;
            this.number = c;
        }

        public override string ToString()
        {
            return "Nome: " + name + 
                " Email:" + email + 
                " Number: " + number;
        }

		//PEGA O NOME DO USUARIO E RETORNA UMA STRING
        public static string picName()
        {
            Console.Write("\nNome do Cliente: ");
            return Console.ReadLine();

        }
		
		//PEGA O EMAIL DO USUARIO E RETORNA UMA STRING
        public static string picEmail()
        {
            Console.Write("\nEmail: ");
            return Console.ReadLine();
        }

		//PEGA O NUMERO DO USUARIO E RETORNA UMA STRING
        public static string picNumber()
        {
            Console.Write("\nNumero de Telefone: ");
            return Console.ReadLine();
        }

		//PROCURA NA LISTA UM CLIENTE A PARTIR DO NOME E MOSTRA NA TELA TODAS INFORMACOES DO CLIENTE PROCURADO
        public static void GetClientByName(List<Cadastro> list, string n)
        {
            var client = list.SingleOrDefault(x => x.name.Equals(n));
            if(client != null) {
                Console.WriteLine($"nome: {client.name} \nEmail: {client.email} \nNumero: {client.number}");
            }
            else
            {
                Console.WriteLine("\nCliente nao encontrado");
            }
            

        }

		//LISTA TODOS OS CLIENTES EXISTENTES NA LISTA
        public static void ListClients(List<Cadastro> list)
        {
            foreach(var client in list)
            {
                Console.WriteLine(client);
            }
        }

         
		//PROCURA UM CLIENTE A PARTIR DO NOME E EXLUI O MESMO DA LISTA
        public static void RemoveClient(List<Cadastro> list, string n)
        {
            var client = list.SingleOrDefault(x => x.name.Equals(n));
            if(client != null)
            {
                Console.WriteLine("\nCliente excluido com sucesso");
                list.Remove(client);
            }
            else{
                Console.WriteLine("\nCliente nao encontrado");
            }
        }


		//PROCURA UM CLIENTE PELO NOME E APOS ALTERA SUAS INFORMACOES
        public static void AlterClient(List<Cadastro> list, string n)
        {
            var client = list.SingleOrDefault(x => x.name.Equals(n));
            if (client != null) {
                client.name = Cadastro.picName();
                client.email = Cadastro.picEmail();
                client.number = Cadastro.picNumber();
            }
            else
            {
                Console.WriteLine("\nCliente nao encontrado");
            }
        }


		//ADICIONA UM CLIENTE NA LISTA
        public static void AddClient(List<Cadastro> list)
        {
            list.Add(new Cadastro(Cadastro.picName(), Cadastro.picEmail(), Cadastro.picNumber()));
            Console.WriteLine("\nCADASTRO CONCLUIDO");
        }

    }
}
