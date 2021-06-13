using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StrExample
{
    class Test
    {
        static void Main(string[] args)
        {
            string str = "Welcome to Dotnet Programming...";
            Console.WriteLine("Length of String is  " +str.Length);
            Console.WriteLine("Lower Case String  " +str.ToLower());
            Console.WriteLine("Upper Case String  " +str.ToUpper());
            string s1 = "Mahitha", s2 = "Niharika", s3 = "Mahitha";
            Console.WriteLine(s1==s2);
            Console.WriteLine(s1==s3);
            Console.WriteLine(s1.Equals(s2));
            Console.WriteLine(s1.Equals(s3));
        }
    }
}
