using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MemMgmtApp
{
    internal class Product: IDisposable
    {

        public string Title { get; set; }
        public double Unitprice { get;set; }
        public Product(string title, double unitprice)
        {
            Title = title;
            Unitprice = unitprice;
        }
        ~Product() { 

            //Clean Up code
        }

        public void Dispose()
        {
            //self reference
            GC.SuppressFinalize(this);
        }
    }
}
