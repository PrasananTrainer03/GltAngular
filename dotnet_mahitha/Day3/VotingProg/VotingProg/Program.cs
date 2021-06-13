using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace VotingProg
{
    class Demo
    {
        public void Check(int age)
        {
            if (age >= 18)
            {
                Console.WriteLine("He is Elligible for voting...");
            } 
            else
            {
                Console.WriteLine("He is Not Elligible for voting...");
            }
        }
        static void Main(string[] args)
        {
            int age;
            Console.WriteLine("Enter Age   ");
            age = Convert.ToInt32(Console.ReadLine());
            Demo obj = new Demo();
            obj.Check(age);
        }
    }
}
