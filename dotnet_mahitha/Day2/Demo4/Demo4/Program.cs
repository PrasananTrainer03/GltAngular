using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Demo4
{
    class Demo
    {
        public void Sum(int a,int b)
        {
            int c = a + b;
            Console.WriteLine("Sum is  " +c);
        }
        static void Main(string[] args)
        {
            int a, b;
            Console.WriteLine("Enter 2 Numbers   ");
            a = Convert.ToInt32(Console.ReadLine());
            b = Convert.ToInt32(Console.ReadLine());
            Demo obj = new Demo();
            obj.Sum(a, b);
        }
    }
}
