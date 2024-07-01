using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestHello
{
    public   class Person
    {
        private  int id;
        private string name;
        private int age;
        
        //constructor overloading
        //constructo chaining
        public Person():this(23, "Raj",23) { 
            //
        }
        public Person(int id, string name, int age)
        {
            this.id = id;
            this.name = name;
            this.age = age;
        }
        ~Person() { }
        public int getId() { return id; }
        public string getName() { return name; }
       
        //property encapsulate getter and setter functionality
        public int Age
        {
            get { return age; }
            set { age = value; }
        }
        public void setName(string  name) { this.name = name; }
        public void setId(int id) { this.id=id; }





    }
}
