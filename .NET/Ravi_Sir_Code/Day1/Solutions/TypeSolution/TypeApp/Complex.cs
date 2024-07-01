using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TypeApp
{
    public class Complex
    {
        private int Real {  get; set; }
        private int Image { get; set; }

        public Complex() { }    
        public Complex(int real, int imag)
        {
            Real = real;
            Image = imag;

        }
    }
}
