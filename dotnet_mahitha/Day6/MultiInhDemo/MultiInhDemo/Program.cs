using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MultiInhDemo
{
    interface IOne
    {
        void Name();
    }

    interface ITwo
    {
        void Email();
    }

    class Mahitha : IOne, ITwo
    {
        public void Email()
        {
            Console.WriteLine("Email mahitha@gmail.com");
        }

        public void Name()
        {
            Console.WriteLine("Name is Mahitha...");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Mahitha obj = new Mahitha();
            obj.Name();
            obj.Email();
        }
    }
}
