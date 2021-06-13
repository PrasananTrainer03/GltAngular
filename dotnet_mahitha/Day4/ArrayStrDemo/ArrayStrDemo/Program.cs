using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ArrayStrDemo
{
    class Demo
    {
        public void Show()
        {
            string[] names = new string[]
            {
                "Mahitha","Ram","Vijay","Yukthi","Niharika"
            };
            for(int i = 0; i < names.Length; i++)
            {
                Console.WriteLine(names[i]);
            }
        }
        static void Main(string[] args)
        {
            Demo obj = new Demo();
            obj.Show();
        }
    }
}
