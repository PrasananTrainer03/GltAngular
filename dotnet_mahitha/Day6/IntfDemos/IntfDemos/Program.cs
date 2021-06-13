using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace IntfDemos
{
    interface ITraining
    {
        void Name();
        void Email();
    }

    class Ramya : ITraining
    {
        public void Email()
        {
            Console.WriteLine("Email is ramya@gmail.com");
        }

        public void Name()
        {
            Console.WriteLine("Name is Ramya...");
        }
    }
    class Mahitha : ITraining
    {
        public void Email()
        {
            Console.WriteLine("Email is Mahitha@gmail.com");
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
            ITraining[] arr = new ITraining[]
            {
                new Ramya(),new Mahitha()
            };
            foreach(ITraining t in arr) {
                t.Name();
                t.Email();
            }
        }
    }
}
