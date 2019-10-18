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

        public static string PicName()
        {
            Console.Write("\nNome do Cliente: ");
            return Console.ReadLine();

        }

        public static string PicEmail()
        {
            Console.Write("\nEmail: ");
            return Console.ReadLine();
        }

        public static string PicNumber()
        {
            Console.Write("\nNumero de Telefone: ");
            return Console.ReadLine();
        }

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

        public static void ListClients(List<Cadastro> list)
        {
            foreach(var client in list)
            {
                Console.WriteLine(client);
            }
        }

         
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


        public static void AlterClient(List<Cadastro> list, string n)
        {
            var client = list.SingleOrDefault(x => x.name.Equals(n));
            if (client != null) {
                client.name = Cadastro.PicName();
                client.email = Cadastro.PicEmail();
                client.number = Cadastro.PicNumber();
            }
            else
            {
                Console.WriteLine("\nCliente nao encontrado");
            }
        }

        public static void AddClient(List<Cadastro> list)
        {
            list.Add(new Cadastro(Cadastro.PicName(), Cadastro.PicEmail(), Cadastro.PicNumber()));
            Console.WriteLine("\nCADASTRO CONCLUIDO");
        }

    }
}
