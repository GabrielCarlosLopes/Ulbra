using System;
using System.Collections.Generic;
using System.Linq;

namespace ProjetoCSharp
{
    class Cadastro
    {
        private string name;
        private string email;
        private string number;

        //CONSTRUTOR
        public Cadastro(string a, string b, string c)
        {
            this.name = a;
            this.email = b;
            this.number = c;
        }

        public override string ToString()
        {
            return  "{Nome: " + name + 
                    " Email:" + email + 
                    " Number: " + number+"}";
        }

        //PEGA O NOME DO CLIENTE
        public static string PicName()
        {
            Console.Write("\nNome do Cliente: ");
            return Console.ReadLine();
        }

        //PEGA O EMAIL DO CLIENTE
        public static string PicEmail()
        {
            Console.WriteLine("\nDigite o seu email: ");
            return Console.ReadLine();
        }

        //PEGA O NUMERO DO CLIENTE
        public static string PicNumber()
        {
            string number;
            do {
                Console.Write("\nNumero de Telefone: ");
                number = Console.ReadLine();
                if(number.Length != 11)
                {
                    Console.WriteLine("Numero invalido, tente novamente");
                }
            } while (number.Length != 11);

            return number;
        }

        //CONSULTA UM USUARIO PELO NOME
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

        //LISTA TODOS OS CLIENTE CADASTRADOS
        public static void ListClients(List<Cadastro> list)
        {
            if(list.Count == 0)
            {
                Console.WriteLine("\nLista Vazia");
            }
            foreach(var client in list)
            {
                Console.WriteLine(client);
            }
        }

         
        //REMOVE UM CLIENTE A PARTIR DO NOME
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


        //ALTERA UM CLIENTE A PARTIR DO NOME
        public static void AlterClient(List<Cadastro> list, string n)
        {
            var client = list.SingleOrDefault(x => x.name.Equals(n));
            if (client != null) {
                Console.WriteLine("\nALTERANDO DADOS DO USUARIO " + client.name);
                client.name = Cadastro.PicName();
                client.email = Cadastro.PicEmail();
                client.number = Cadastro.PicNumber();
            }
            else
            {
                Console.WriteLine("\nCliente nao encontrado");
            }
        }


        //ADICIONA UM NOVO CLIENTE A LISTA
        public static void AddClient(List<Cadastro> list)
        {
            list.Add(new Cadastro(Cadastro.PicName(), Cadastro.PicEmail(), Cadastro.PicNumber()));
            Console.WriteLine("\nCADASTRO CONCLUIDO");
        }

    }
}
