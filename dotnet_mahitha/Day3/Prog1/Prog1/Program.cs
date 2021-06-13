using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Prog1
{
    class Data
    {
        public void Mahitha()
        {
            Console.WriteLine("Hi I am Mahitha...");
        }

        internal void Prasanna()
        {
            Console.WriteLine("Hi I am Prasanna...");
        }

        private void Vijay()
        {
            Console.WriteLine("Hi i am Vijay...");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Data obj = new Data();
            obj.Prasanna();
            obj.Mahitha();
        }
    }
}
