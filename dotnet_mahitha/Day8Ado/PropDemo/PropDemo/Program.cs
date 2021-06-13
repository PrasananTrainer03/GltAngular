using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PropDemo
{
    class Program
    {
        static void Main(string[] args)
        {
            Employ emp1 = new Employ();
            emp1.Empno = 1;
            emp1.Name = "Mahitha";
            emp1.Basic = 88266;

            Employ emp2 = new Employ();
            emp2.Empno = 3;
            emp2.Name = "Shailaja";
            emp2.Basic = 88211;

            Console.WriteLine(emp1);
            Console.WriteLine(emp2);
        }
    }
}
