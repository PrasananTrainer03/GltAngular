using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FactorialEx
{
    class Demo
    {
        public void Calc(int n)
        {
            int f = 1;
            for(int i = 1; i <= n; i++)
            {
                f = f * i;
            }
            Console.WriteLine("Factorial Value    " +f);
        }
        static void Main(string[] args)
        {
            int n;
            Console.WriteLine("Enter N value   ");
            n = Convert.ToInt32(Console.ReadLine());
            Demo obj = new Demo();
            obj.Calc(n);
        }
    }
}
