/*Shape Hierarchy:
Problem Statement: Design a hierarchy of shape classes.
 Begin with a base class Shape and then create derived classes like Circle, Rectangle, and Triangle. 
Each shape should have methods for calculating area and perimeter specific to its geometry.*/
#include<iostream>
#include<string>
using namespace std;
class shape{
   int vertices;
   int sides ;

 public:
   shape(){
    vertices = 0;
    sides = 0 ;

    cout<<"-------In shape default Constructor ;"<<endl;
   }
   
   shape(int vertices , int sides ){
     this->vertices= vertices;
     this->sides=sides;
     cout<<"----------In shape parametrized constructor"<<endl;
   }


     void displayParameters(){
      cout<<"Vertices are :"<<vertices<<endl;
      cout<<"sides are :"<<sides<<endl;
   } };

   class Circle : public shape {
    float radius ;
    public:
    Circle(){
        
       radius = 5;
       cout<<"------Inside Circle default Constructor---------"<<endl;
    }

    Circle (int vertice , int side,int radius): shape( vertice ,  side ){

       this->radius=radius;
    }
     

    void CircleArea(){
        float area = 3.14 * radius * radius ;
        cout<<"Area of circle is :"<<area<<endl;
        float perimeter = 2 * 3.14 * radius;
        cout<<"Perimeter of Circle is :"<<perimeter<<endl;
    }
    void displayParameters(){
        shape::displayParameters();
      cout<<"radius is :"<<radius<<endl;
   }
   };


    class Triangle : public shape {
    float height  ;
    float base ;
    public:
   Triangle (){
        height = 0 ;
     base =0;
       cout<<"------Inside Triangle default Constructor---------"<<endl;
    }

    Triangle (int vertice , int side, float base , float height): shape( vertice ,  side ){
       this->height= height;
       this->base = base ;
       cout<<"------Inside Triangle default Constructor---------"<<endl;
    }
     

    void TriangleArea(){
        float area1 = 0.5*base*height;
        cout<<"Area of circle is :"<<area1<<endl;
        float perimeter2 = base*3;
        cout<<"Perimeter of Circle is :"<<base<<endl;
    }
    void displayParameters(){
      cout<<"base is :"<<base<<endl;
      cout<<"height is"<<height;
   }


   };



class Rectangle : public shape {
    float breadth  ;
    float length ;
  public:
   Rectangle(){
         breadth =0 ;
         length=0;
       cout<<"------Inside Triangle default Constructor---------"<<endl;
    }

    Rectangle (int vertice , int side, float length , float breadth): shape( vertice ,  side ){
       this->breadth= breadth;
       this->length = length ;
       cout<<"------Inside Triangle default Constructor---------"<<endl;
    }
     

    void RectangleArea(){
        float area2 = length*breadth;
        cout<<"Area of rectangle is :"<<area2<<endl;
        float perimeter2 = 2*(length+breadth);
        cout<<"Perimeter of Circle is :"<<perimeter2<<endl;
    }
    void displayParameters(){
        shape::displayParameters();
      cout<<"length is :"<<length<<endl;
      cout<<" breadthis"<<breadth<<endl;
   }


   };




int main(){

    shape s ;
    s.displayParameters();
     Circle c (0,0,5);
     c.displayParameters();
     Rectangle r(4,4,10,15);
     r.displayParameters();
    return 0 ;
}