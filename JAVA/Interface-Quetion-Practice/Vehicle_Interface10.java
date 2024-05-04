/*10)Vehicle interface and car and truck classes:
Create an interface called Vehicle that has two abstract methods:
drive() and stop(). Then create two classes called Car and Truck that
implement the Vehicle interface. The Car class should have instance variables
for the car's make and model, and the Truck class should have instance variables
for the truck's load capacity and towing capacity. Implement the drive() and stop()
methods for each class.
 */

import java.util.Scanner;

interface Vehicle1{
    void drive();
    void stop();
 }

 class Car1 implements Vehicle1{
    int car_make;
    String model;

     @Override
     public void drive() {
         System.out.println("Car is Driving");
     }

     @Override
     public void stop() {
         System.out.println("Car is stopped");
     }
 }
 class Truck implements Vehicle1{
    float load_cap;
    float towing_cap;

     @Override
     public void drive() {
         System.out.println("Truck is Driving");
     }

     @Override
     public void stop() {
         System.out.println("Truck is Stopped");
     }
 }
public class Vehicle_Interface10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter car making Year");
        int car_mk=sc.nextInt();
        System.out.println("Enter car model");
        String model=sc.next();
        System.out.println("Enter the loading capacity of Truck");
        float load_cap=sc.nextFloat();
        System.out.println("Enter the towing capacity of Truck");
        float towing_cap=sc.nextFloat();

        Car1 c=new Car1();
        c.drive();
        c.stop();

        Truck t=new Truck();
        t.drive();
        t.stop();

    }
}
