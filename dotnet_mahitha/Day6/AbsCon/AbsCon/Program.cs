using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbsCon
{
    abstract class Employ
    {
        int empno;
        string name;
        double basic;

        public Employ(int empno, string name, double basic)
        {
            this.empno = empno;
            this.name = name;
            this.basic = basic;
        }

        public override string ToString()
        {
            return "Employ No  " + empno + " Name  " + name + " Basic  " + basic;
        }
    }

    class Mahitha : Employ
    {
        public Mahitha(int empno, string name, double basic) : base(empno,name,basic)
        {

        }
    }

    class Swetha : Employ
    {
        public Swetha(int empno, string name, double basic) : base(empno,name,basic)
        {

        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Employ[] arrEmploy = new Employ[]
            {
                new Mahitha(1,"Mahitha",82834),
                new Swetha(3,"Swetha",88113)
            };
            foreach(Employ e in arrEmploy)
            {
                Console.WriteLine(e);
            }
        }
    }
}
