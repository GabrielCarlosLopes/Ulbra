using System;
using System.Collections.Generic;
using System.Text;

namespace Trabalho
{
    class Cadastro
    {
  
        public int Codigo;
        public String Nome;
        public String Endereco;
        public String Telefone;
        public String Email;

        public static int codIncrement;

        public override string ToString()
        {
            return "\n"+Codigo+": "+Nome+", "+Endereco+", "+Telefone+", "+Email;
        }

        public void ler()
        {
            Codigo = codIncrement;
            codIncrement++;
            Console.WriteLine("\nSEU CODIGO EH: " + Codigo);
            Console.WriteLine("\nDIGITE O NOME: ");
            Nome = Console.ReadLine();
            Console.WriteLine("\nDIGITE O ENDERECO: ");
            Endereco = Console.ReadLine();
            Console.WriteLine("\nDIGITE O TELEFONE: ");
            Telefone = Console.ReadLine();
            Console.WriteLine("\nDIGITE O EMAIL: ");
            Email = Console.ReadLine();  
        }

        public static void consultar(Cadastro[] lista, String nome)
        {
            for(int i=0; i<codIncrement; i++)
            {
                if (nome.Equals(lista[i].Nome))
                {
                    Console.WriteLine(lista[i].Codigo+", "+
                        lista[i].Nome+", "+
                        lista[i].Endereco+", "+
                        lista[i].Email);
                    break;
                }
            }
        }

        public static void mostrar(Cadastro[] lista)
        {
            for(int i=0; i<codIncrement; i++)
            {
                Console.WriteLine(lista[i]);
            }
        }

        

        
    }
}
