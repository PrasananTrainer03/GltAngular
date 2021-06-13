using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ForLoopDemo1
{
    class Demo
    {
        public void Show(int n)
        {
            for(int i=0;i<n;i++)
            {
                Console.WriteLine("Hi I am Mahitha...");
            }
        }
        static void Main(string[] args)
        {
            int n;
            Console.WriteLine("Enter N value   ");
            n = Convert.ToInt32(Console.ReadLine());
            Demo obj = new Demo();
            obj.Show(n);
        }
    }
}
