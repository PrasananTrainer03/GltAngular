using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AdoEmpCrud
{
    class EmploySearch
    {
        static  void Main()
        {
            int empno;
            Console.WriteLine("Enter Employ No   ");
            empno = Convert.ToInt32(Console.ReadLine());
            EmployCrud obj = new EmployCrud();
            Emp emp = obj.SearchEmp(empno);
            if (emp != null)
            {
                Console.WriteLine("Employ Name  " +emp.Name);
                Console.WriteLine("Department   " +emp.Dept);
                Console.WriteLine("Designation   " +emp.Desig);
                Console.WriteLine("Basic   " +emp.Basic);
            }
            else
            {
                Console.WriteLine("*** Record Not Found ***");
            }
        }
    }
}
