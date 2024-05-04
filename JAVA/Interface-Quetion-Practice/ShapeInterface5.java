/*5) Shape interface and square and triangle classes:
    Create an interface called Shape that has two abstract methods:
    getArea() and getPerimeter(). Then create two classes called Square
    and Triangle that implement the Shape interface. The Square class should
    have an instance variable for the side length of the square, and the Triangle class should have
    instance variables for the base and height of the triangle.
    Implement the getArea() and getPerimeter() methods for each class.
 */

import java.util.Scanner;

interface Shape{
    void getArea(int sqLength);
    void getPerimeter(int sqLength);
    void getArea(int trBase,int trHeight);
    void getPerimeter(int trBase,int trHeight);

}

class Square implements Shape{
    int side_length;

    @Override
    public void getArea(int sqLength) {
        side_length=sqLength;
        int sq_area=side_length*side_length;
        System.out.println("Area of Square = "+sq_area);
    }

    @Override
    public void getPerimeter(int sqLength) {
        side_length=sqLength;
        int sq_peri=4*side_length;
        System.out.println("Perimeter of Square = "+sq_peri);
    }

    @Override
    public void getArea(int trBase, int trHeight) {}

    @Override
    public void getPerimeter(int trBase, int trHeight) {}
}

class Triangle implements Shape{
    int base;
    int height;
    @Override
    public void getArea(int sqLength) {}

    @Override
    public void getPerimeter(int sqLength) {}

    @Override
    public void getArea(int trBase, int trHeight) {
        base=trBase;
        height=trHeight;

        int tr_area=base*height/2;
        System.out.println("Area of Triangle = "+tr_area);
    }

    @Override
    public void getPerimeter(int trBase, int trHeight) {
        base=trBase;
        height=trHeight;
        int side2=6;
        int side3=7;
        int tr_peri=base+side2+side3;
        System.out.println("Perimeter of Triangle = "+tr_peri);
    }
}
public class ShapeInterface5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side length of Square");
        int sq_side=sc.nextInt();
        System.out.println("Enter the base of triangle");
        int tri_base=sc.nextInt();
        System.out.println("Enter the height of triangle");
        int tri_height=sc.nextInt();

        Square sq=new Square();
        sq.getArea(sq_side);
        sq.getPerimeter(sq_side);

        Triangle tr=new Triangle();
        tr.getArea(tri_base,tri_height);
        tr.getPerimeter(tri_base,tri_height);

    }
}
