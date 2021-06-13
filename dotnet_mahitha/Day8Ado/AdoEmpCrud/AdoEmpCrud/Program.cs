using System;
using System.Collections.Generic;
using System.Linq;
using System.Data;
using System.Data.SqlClient;
using System.Configuration;
using System.Text;
using System.Threading.Tasks;

namespace AdoEmpCrud
{
    class Program
    {
        static void Main(string[] args)
        {
            Emp emp = new Emp();
            Console.WriteLine("Enter Employ Number   ");
            emp.Empno = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Name    ");
            emp.Name = Console.ReadLine();
            Console.WriteLine("Enter Department   ");
            emp.Dept = Console.ReadLine();
            Console.WriteLine("Enter Designation   ");
            emp.Desig = Console.ReadLine();
            Console.WriteLine("Enter Basic   ");
            emp.Basic = Convert.ToInt32(Console.ReadLine());

            EmployCrud obj = new EmployCrud();
            Console.WriteLine(obj.AddEmploy(emp));
        }
    }
}
