using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestHello
{
    public class Complex
    {
        private int real;
        private int imag;
        public Complex() { 
        
        }
        public Complex(int r, int i)
        {
            this.real = r;
            this.imag = i;

        }

        public static Complex operator+ (Complex a, Complex b)
        {
            Complex temp = new Complex();
            temp.real=a.real+ b.real;
            temp.imag=a.imag+ b.imag;
            return temp;
        }
    }
}
