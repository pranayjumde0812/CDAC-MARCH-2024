/*1) Shape interface and rectangle and circle classes:
Create an interface called Shape that has two abstract methods: getArea() and
getPerimeter(). Then create two classes called Rectangle and Circle that
implement the Shape interface. The Rectangle class should have instance
variables for the length and width of the rectangle, and the Circle class should
have an instance variable for the radius of the circle. Implement the getArea()
and getPerimeter() methods for each class.*/

import java.util.Scanner;
interface Shapes {
    void getArea(int a);
    void getArea(int a, int b);
    void getPerimeter(int c,int d);
    void getPerimeter(int a);
}
class Rectangles implements Shapes{
    int len,widt;
    @Override
    public void getArea(int a) {

    }
    @Override
    public void getArea(int a,int b) {
      len=a;
      widt=b;
        System.out.println("The area of Rectangle = "+len*widt);
    }
    @Override
    public void getPerimeter(int c,int d) {
        len=c;
        widt=d;
        System.out.println("The perimeter of Rectangle = "+(2*(len+widt)));
    }
    @Override
    public void getPerimeter(int a) {
    }
}
class Circle implements Shapes{
    int r;
    @Override
    public void getArea(int a) {
        r=a;
        System.out.println("Area of Circle = "+3.14*r*r);
    }
    @Override
    public void getArea(int a, int b) {

    }
    @Override
    public void getPerimeter(int c, int d) {

    }
    @Override
    public void getPerimeter(int a) {
        r=a;
        System.out.println("The perimeter of Circle = "+2*3.14*r);
    }
}
public class ShapeInterface1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Length of rectangle");
        int lenth=sc.nextInt();
        System.out.println("Enter the value of width of rectangle");
        int width=sc.nextInt();
        System.out.println("Enter the value of radius of rectangle");
        int radius=sc.nextInt();
        Rectangles rect=new Rectangles();
        rect.getArea(lenth,width);
        rect.getPerimeter(lenth,width);

        Circle cir=new Circle();
        cir.getArea(radius);
        cir.getPerimeter(radius);
    }
}