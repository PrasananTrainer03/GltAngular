using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace EvenOddEx
{
    class Demo
    {
        public void Check(int n)
        {
            string result = (n % 2 == 0) ? "Even Number" : "Odd Number";
            Console.WriteLine(result);
        }
        static void Main(string[] args)
        {
            int n;
            Console.WriteLine("Enter N value   ");
            n = Convert.ToInt32(Console.ReadLine());
            Demo obj = new Demo();
            obj.Check(n);
        }
    }
}
