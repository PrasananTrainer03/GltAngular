using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConExample1
{
    class Employ
    {
        int empno;
        string name;
        double basic;

        public Employ()
        {
            this.empno = 1;
            this.name = "Mahitha";
            this.basic = 88234;
        }

        public Employ(int empno, string name, double basic)
        {
            this.empno = empno;
            this.name = name;
            this.basic = basic;
        }

        public override string ToString()
        {
            return " Employ No " + empno + " Name  " + name + " Basic  " + basic;
        }
        static void Main(string[] args)
        {
            Employ emp1 = new Employ();
            Console.WriteLine(emp1);
            Employ emp2 = new Employ(87, "Nikhil", 82345);
            Console.WriteLine(emp2);
        }
    }
}
