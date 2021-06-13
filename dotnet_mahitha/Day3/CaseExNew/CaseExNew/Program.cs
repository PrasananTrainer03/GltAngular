using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CaseExNew
{
    class Demo
    {
        public void Show(string month)
        {
            switch(month)
            {
                case "Jan":
                    Console.WriteLine("Its January...");
                    break;
                case "Feb":
                    Console.WriteLine("Its February...");
                    break;
                case "Mar":
                    Console.WriteLine("Its March...");
                    break;
                case "Apr":
                    Console.WriteLine("Its April...");
                    break;
                case "May":
                    Console.WriteLine("Its May...");
                    break;
                case "Jun":
                    Console.WriteLine("Its June...");
                    break;
                case "Jul":
                    Console.WriteLine("Its July...");
                    break;
                case "Aug":
                    Console.WriteLine("Its August...");
                    break;
                case "Sep":
                    Console.WriteLine("Its September...");
                    break;
                case "Oct":
                    Console.WriteLine("Its October...");
                    break;
                case "Nov":
                    Console.WriteLine("Its November...");
                    break;
                case "Dec":
                    Console.WriteLine("Its December...");
                    break;
                default:
                    Console.WriteLine("Invalid Month...");
                    break;
            }
        }
        static void Main(string[] args)
        {
            string month;
            Console.WriteLine("Enter First 3 chars of Month...");
            month = Console.ReadLine();
            Demo obj = new Demo();
            obj.Show(month);
        }
    }
}
