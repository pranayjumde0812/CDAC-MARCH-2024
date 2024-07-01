using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GDILib
{
    public sealed class Line:Shape,IPrintable, IStorable
    {
        //Auto Property
        public Point StartPoint { get; set; }
        public Point EndPoint { get; set; }

        public static int count;
        public Line()
        {
            count++;
            this.StartPoint = new Point();
            this.EndPoint = new Point();
            this.Thickness = thickness;

        }

        public Line(Point stPoint , Point endPoint, int thickness)
        {
            count++;
            this.StartPoint = stPoint;
            this.EndPoint = endPoint;
            this.Thickness = thickness;

        }
        private  int thickness;
        public int Thickness
        {
            get { return thickness; }
            set { 
                if(value <= 0)
                {
                    throw new ArgumentException("Line can not have zero value");
                }
                this.thickness = value;
            }

        }

        public override void Draw()
        {
            Console.WriteLine("Drawing a Line");
        }

        void IPrintable.Print()
        {
            Console.WriteLine("Printing Line.....");
        }

        void IStorable.Store() { }
        void IStorable.Restore() { }


        public override string ToString()
        {
           
           return this.StartPoint.ToString() + " "+ 
                this.EndPoint.ToString()+ " Thickness= " +
                this.Thickness;
        }
    }
}
