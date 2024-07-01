using GDILib;
//Minimal code strategy
try
{

    Line l1 = new Line(new Point(2, 4), new Point(10, 15), 5);
    //l1.Thickness = -1;

    l1.Draw();
    Line l2 = new Line(new Point(23, 34), new Point(100, 12), 5);
    Line l3 = new Line(new Point(67, 34), new Point(100, 8), 3);
    Line l4 = new Line(new Point(12,89), new Point(90,5),3);

    Point pt = new Point();
    pt.X = 56;
    pt.Y = 120;

    Console.WriteLine("Printing indivisual Point ");
    Console.WriteLine(pt);

    Console.WriteLine(l1);
    Console.WriteLine(l2);
    Console.WriteLine(l3);
    Console.WriteLine(l4);

}
catch(ArgumentException e)
{

    Console.Write(e.Message);
}

finally
{

}



int amount = 56;
double unitPrice = 5.7;
bool status = false;

var p = new Line(new Point(12, 25), new Point(45, 123), 4);
p.Draw();

dynamic fullName = "Ravi Tambade";






Console.WriteLine(Line.count);

