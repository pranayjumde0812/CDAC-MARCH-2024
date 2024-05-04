/*
13)	Vehicle interface and bicycle and motorcycle classes:
Create an interface called Vehicle that has two abstract methods:
start() and stop(). Then create two classes called Bicycle and Motorcycle
that implement the Vehicle interface. The Bicycle class should have an instance
variable for the number of gears, and the Motorcycle class should have an instance
variable for the engine displacement. Implement the start() and stop() methods for each class.
 */

interface Vehicle2{
    public void start();
    public void stop();
}
class Bicycle implements Vehicle2{
    int nog;

    @Override
    public void start() {
        System.out.println("Bicycle starts");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle stops");
    }
}
class Motorcycle1 implements Vehicle2{
    int engDisp;

    @Override
    public void start() {
        System.out.println("Motorcycle starts");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stops");
    }
}
public class VehicleInterface13 {
    public static void main(String[] args) {

      Bicycle bc=new Bicycle();
      bc.start();
      bc.stop();

      Motorcycle1 mc=new Motorcycle1();
      mc.start();
      mc.stop();

    }
}
