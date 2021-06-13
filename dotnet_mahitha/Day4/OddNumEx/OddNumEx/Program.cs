using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OddNumEx
{
    class Demo
    {
        public void Show(int n)
        {
            for(int i=1;i<n;i+=2)
            {
                Console.WriteLine("Odd No  " +i);
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
