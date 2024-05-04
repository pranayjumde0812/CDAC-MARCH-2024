/*4)Vehicle interface and car and motorcycle classes:
 Create an interface called Vehicle that has two abstract methods:
 start() and stop(). Then create two classes called Car and Motorcycle that
 implement the Vehicle interface. The Car class should have instance variables for the car's
 make and model, and the Motorcycle class should have an instance variable for the motorcycle's engine size.
 Implement the start() and stop() methods for each class.
*/

import java.util.Scanner;

interface Vehicle{
  public void start();
  public void stop();
}

class Car implements Vehicle{

    int car_make;
    String model;
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stoped");
    }
}
class Motorcycle implements Vehicle{

    int eng_size;
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }
    @Override
    public void stop(){
        System.out.println("Motorcycle stoped");
    }
}
public class Vehicle_Interface4 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Car's make year");
    int car_make= sc.nextInt();
    System.out.println("Enter Model of car");
    String model=sc.nextLine();
    System.out.println("Enter engine Size");
    int eng_size;

     Car c=new Car();
     c.start();
     c.stop();

     Motorcycle mc=new Motorcycle();
     mc.start();
     mc.stop();

    }
}

