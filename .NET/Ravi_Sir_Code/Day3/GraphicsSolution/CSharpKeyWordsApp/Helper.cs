using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Utility
{
    public  static  class Helper
    {
        public  const double PI= 3.14;


        public static void Swap( ref object     obj1, ref  object obj2)
        {
            object temp;
            temp = obj1;
            obj1 = obj2;
            obj2 = temp;

        }

        public static void Calculate(int radius, out double area, out double circum)
        {

            area = PI * radius * radius;
            circum = 2 * PI * radius;
        }

        public static void Display(params string[] names)
        {
            foreach (string name in names)
            {
                Console.WriteLine(name);
            }
        }

    }
}
