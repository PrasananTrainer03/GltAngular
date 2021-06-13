using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Demo2
{
    class Demo
    {
        public void Mahitha()
        {
            Console.WriteLine("Hi I am Mahitha from Infosys...");
        }

        private void Vijay()
        {
            Console.WriteLine("Hi I am Vijay...");
        }

        internal void Prasanna()
        {
            Console.WriteLine("Hi I am Prasanna...");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Demo obj = new Demo();
            obj.Mahitha();
            obj.Prasanna();
        }
    }
}
