using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PosNeg
{
    class Data
    {
        public void Check(int n)
        {
            if (n >= 0)
            {
                Console.WriteLine("Positive Number...");
            } else
            {
                Console.WriteLine("Negative Number...");
            }
        }
        static void Main(string[] args)
        {
            int n;
            Console.WriteLine("Enter N value  ");
            n = Convert.ToInt32(Console.ReadLine());
            Data obj = new Data();
            obj.Check(n);
        }
    }
}
