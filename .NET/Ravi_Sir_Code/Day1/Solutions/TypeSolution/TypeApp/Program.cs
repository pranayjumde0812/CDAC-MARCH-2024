// See https://aka.ms/new-console-template for more information
using TypeApp;

Console.WriteLine("Hello, World!");


//Refernce Types

//object of class are always create on heap
Complex c1 = new Complex();
Complex c2 = new Complex(45,56);

//Value type variables:

//objects of structure are always created on stack
Point pt1 = new Point();
pt1.X = 12;
pt1.Y = 12;

Line  line=new Line();
Shape shape = line;
shape.Draw(); //-----------------non static function

IPrintable printable = line;
printable.Print();

int result=MathEngine.Addition(56, 67); //static function



//Shape s = new Shape(); //abstract class


Line line1 = new Line();  // concrete class



Account acct = new Account();

acct.Balance = 5600;
acct.AccoutId = 56;
acct.RegistrationDate = new DateTime(2024, 5, 15);
acct.Holder = "Ravi Tambade";
acct.RegisteredEmail = "ravi.tambade@transflower.in";

