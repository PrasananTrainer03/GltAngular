using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PosNegEx
{
    class Demo
    {
        public void Check(int n)
        {
            string result = (n >= 0) ? "Positive" : "Negative";
            Console.WriteLine(result);
        }
        static void Main(string[] args)
        {
            int n;
            Console.WriteLine("Enter a Number   ");
            n = Convert.ToInt32(Console.ReadLine());
            Demo obj = new Demo();
            obj.Check(n);
        }
    }
}
