using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestHello
{
     class Employee:Person
    {
        //Auto property
        public double BasicSalary {  get; set; }
        public double DA { get; set; }

        public Employee():this(45, "raj",23, 25000,500) { }

        //Member Initialized List
        public Employee(int  id, string name, int age,

                        double basicSalary, double da):base(id, name,age) { 
            BasicSalary=basicSalary;
            DA=da;
        }
          public virtual double ComputePay()
        {
            return BasicSalary + (DA * 25);
        }

        public override string ToString()
        {
            return base.ToString();
        }
    }
}
