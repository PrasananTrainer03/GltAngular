using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbsExample
{
    abstract class Training
    {
        public abstract void Name();
        public abstract void Email();
    }

    class Vinay : Training
    {
        public override void Email()
        {
            Console.WriteLine("Email is Vinay@gmail.com");
        }

        public override void Name()
        {
            Console.WriteLine("Name is Vinay...");
        }
    }
    class Mahitha : Training
    {
        public override void Email()
        {
            Console.WriteLine("Email is mahitha@gmail.com");
        }

        public override void Name()
        {
            Console.WriteLine("Name is Mahitha...");
        }
    }
    class Program
    {
        static void Main(string[] args)
        {
            Training[] arr = new Training[]
            {
                new Vinay(),
                new Mahitha()
            };
            foreach(Training t in arr)
            {
                t.Name();
                t.Email();
            }
        }
    }
}
