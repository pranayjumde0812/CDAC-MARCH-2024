using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GDILib
{
    public  interface IStorable
    {
        void Store();
        void Restore();
    }
}
