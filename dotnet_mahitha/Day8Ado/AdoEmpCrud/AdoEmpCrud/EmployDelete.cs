using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AdoEmpCrud
{
    class EmployDelete
    {
        static void Main()
        {
            int empno;
            Console.WriteLine("Enter Employ No    ");
            empno = Convert.ToInt32(Console.ReadLine());
            EmployCrud obj = new EmployCrud();
            Console.WriteLine(obj.DeleteEmp(empno));
        }
    }
}
