class MyThread1 extends Thread
{

}

class PriorityThread1 {
  public static void main(String [] args)
  {
	  System.out.println(Thread.currentThread().getPriority());
	  
	  Thread.currentThread().setPriority(7);
	  
	  MyThread1 thread = new MyThread1();
	  
	  System.out.println(Thread.currentThread().getPriority());
	  
  }
}