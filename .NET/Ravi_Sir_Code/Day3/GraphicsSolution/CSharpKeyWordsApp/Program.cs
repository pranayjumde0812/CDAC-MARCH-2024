
using System.Runtime.InteropServices.ObjectiveC;
using System.Collections.Generic;
using GDILib;
using Utility;
using CRM;


Helper.Display("Raj", "Maya", "Sameer");
Helper.Display("Ravi");
Helper.Display("Sham", "Manisha", "Sharon", "Kanak");

int num1 = 45;
int num2 = 67;
object o1 = num1;
object o2 = num2;

Helper.Swap(ref o1, ref o2 );

int radius = 25;
double area = 0;
double circum = 0;
Helper.Calculate(radius, out area, out circum);
Console.WriteLine("Area= "+ area+ " Circumference= "+ circum);

int[] marks = { 45, 65, 76, 35 };

foreach(int mark in marks)
{
    Console.WriteLine(mark);

}


List<Line> lines = new List<Line>();


Line l1 = new Line(new Point(2, 4), new Point(10, 15), 5);
//l1.Thickness = -1;

l1.Draw();
Line l2 = new Line(new Point(23, 34), new Point(100, 12), 5);
Line l3 = new Line(new Point(67, 34), new Point(100, 8), 3);
Line l4 = new Line(new Point(12, 89), new Point(90, 5), 3);


lines.Add(l1);
lines.Add(l2);
lines.Add(l3);
lines.Add(l4);

foreach(Line line in lines)
{
    Console.WriteLine(line);
}
 
Stack<Line> stack = new Stack<Line>();
stack.Push(l1);
stack.Push(l2);
stack.Push(l3);
stack.Push(l4);

Line theLine=(Line)stack.Pop();

Queue<Line> queue = new Queue<Line>();

queue.Enqueue(theLine);
queue.Enqueue(l1);
queue.Enqueue(l2);
queue.Enqueue(l3);
queue.Enqueue(l4);

Line line23=queue.Dequeue();

Dictionary<string, Line> map = new Dictionary<string, Line>();
map.Add("vertical", l1);
//map.Add("vertical", l3);
map.Add("diagonal", l2);

Line diagonalLine = map["diagonal"];


Customer customer = new Customer();
customer.Name = "Raj Malhotra";
customer.Email = "raj.malhotra@gmail.com";
customer.ContactNumber = "9881735801";
customer.Location = "123.34. 34.56";
Console.ReadLine();