using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CaseDemo
{
    class Demo
    {
        public void Show(int a,int b,int ch)
        {
            int c;
            switch (ch)
            {
                case 1:
                    c = a + b;
                    Console.WriteLine("Sum is  " +c);
                    break;
                case 2:
                    c = a - b;
                    Console.WriteLine("Sub is  " +c);
                    break;
                case 3:
                    c = a * b;
                    Console.WriteLine("Mult is  " +c);
                    break;
                case 4:
                    c = a / b;
                    Console.WriteLine("Division is  " +c);
                    break;
                default:
                    Console.WriteLine("Invalid Choice...");
                    break;
            }
        }
        static void Main(string[] args)
        {
            int a, b;
            Console.WriteLine("Enter 2 Numbers  ");
            a = Convert.ToInt32(Console.ReadLine());
            b = Convert.ToInt32(Console.ReadLine());
            int ch;
            Console.WriteLine("Enter Choice from (1-4) only  ");
            ch = Convert.ToInt32(Console.ReadLine());
            Demo obj = new Demo();
            obj.Show(a, b, ch);
        }
    }
}
