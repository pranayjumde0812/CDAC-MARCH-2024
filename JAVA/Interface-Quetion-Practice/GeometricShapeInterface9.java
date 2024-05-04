/*
9)GeometricShape interface and rectangle and circle classes:
Create an interface called GeometricShape that has one abstract method:
getArea(). Then create two classes called Rectangle and Circle that implement
the GeometricShape interface. The Rectangle class should have instance variables
for the length and width of the rectangle, and the Circle class should have an instance
variable for the radius of the circle. Implement the getArea() method for each class.
 */

import java.util.Scanner;

interface GeometricShape{
  void getArea(int len,int wid);
  void getArea(int rad);
}

class Rectangle implements GeometricShape{
    int l,b;
    @Override
    public void getArea(int len, int wid) {
    l=len;
    b=wid;
        System.out.println("Area of rectangle = "+(l*b));

    }
    @Override
    public void getArea(int rad) {}
}
class Circle2 implements GeometricShape{
    int r;

    @Override
    public void getArea(int len, int wid) {}

    @Override
    public void getArea(int rad) {
      r=rad;
        System.out.println("Area of Circle = "+(3.14*r*r));
    }
}
public class GeometricShapeInterface9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        int lengthh=sc.nextInt();
        System.out.println("Enter the breadth of rectangle");
        int breadth=sc.nextInt();
        System.out.println("Enter the radius of circle");
        int radius=sc.nextInt();

        Rectangle re=new Rectangle();
        re.getArea(lengthh,breadth);

        Circle2 c=new Circle2();
        c.getArea(radius);
    }
}
