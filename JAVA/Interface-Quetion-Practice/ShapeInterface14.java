/*14)	Shape interface and ellipse and rhombus classes:
Create an interface called Shape that has two abstract methods:
getArea() and getPerimeter(). Then create two classes called Ellipse
and Rhombus that implement the Shape interface. The Ellipse class should
have instance variables for the major and minor axes, and the Rhombus class
should have instance variables for the diagonals. Implement the getArea() and
getPerimeter() methods for each class.
 */

import java.util.Scanner;

interface Shape3{
    void getArea(int dg1,int dg2);
    void getPerimeter(int side);
    void getArea(int majAx,int minAx,int num);

}
class Ellipse implements Shape3{
    int major_axes;
    int minor_axes;

    @Override
    public void getArea(int dg1, int dg2) {}

    @Override
    public void getPerimeter(int side) {}

    @Override
    public void getArea(int majAx, int minAx, int num) {
     major_axes=majAx;
     minor_axes=minAx;

     int a=major_axes/2;
     int b=minor_axes/2;

        System.out.println("Area of Ellipse = "+3.14*a*b);

    }
}

class Rhombus implements Shape3{
    int diagonal1;
    int diagonal2;

    @Override
    public void getArea(int dg1, int dg2) {
        diagonal1=dg1;
        diagonal2=dg2;
        System.out.println("Area of Rhombus = "+(diagonal1*diagonal2/2));
    }

    @Override
    public void getPerimeter(int side) {
        System.out.println("Perimeter of Rhombus = "+4*side);
    }

    @Override
    public void getArea(int majAx, int minAx, int num) {}
}
public class ShapeInterface14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter diagonal 1 of rhombus");
        int dg1=sc.nextInt();
        System.out.println("Enter diagonal 2 of rhombus");
        int dg2=sc.nextInt();
        System.out.println("Enter side length of rhombus");
        int side=sc.nextInt();

        System.out.println("Enter major axis of Ellipse");
        int majAxis=sc.nextInt();
        System.out.println("Enter diagonal minor axis of Ellipse");
        int minAxis=sc.nextInt();

        Rhombus rhombus=new Rhombus();
        rhombus.getArea(dg1,dg2);
        rhombus.getPerimeter(side);

        Ellipse ellipse=new Ellipse();
        ellipse.getArea(majAxis,minAxis,1);
       // ellipse.getPerimeter();

    }
}
