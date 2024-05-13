import java.lang.*;

class MyThread extends Thread
{
  public void run()
  {
    System.out.println("No - args run method");
  }
  
  public void run (int i)
  {
    System.out.println("Int - args Run method");
  }
}