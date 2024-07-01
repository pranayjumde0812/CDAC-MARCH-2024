using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TypeApp
{
    public abstract  class  Shape
    {

        protected Color ShapeColor { get; set; }
        protected  int Width { get; set; }
       public abstract void Draw();

    }
}
