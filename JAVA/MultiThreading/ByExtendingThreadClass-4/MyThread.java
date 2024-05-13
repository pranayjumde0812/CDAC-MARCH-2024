import java.lang.*;

class MyThread extends Thread
{
  public void run()
  {
    System.out.println("run method");
  }
  
   public void start()
  {
    System.out.println("start method");
  }
  
}