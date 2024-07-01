using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
//Object Oriented Programming

//It is a discipline of coding while building software
//for achieving reusibility, encapsulation, inheritance and Polymorphism

namespace TypeApp
{
    //Whenever you want to define helper functions 
    //define them into static class
    public  static  class MathEngine
    {

        public static int Addition(int a, int b)
        {
            return a + b;
        }
        public static int Subtraction(int a, int b)
        {
            return (a - b);
        }
    }
}
