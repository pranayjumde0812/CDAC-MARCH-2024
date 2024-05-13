class MyThread1 extends Thread
{
  public void run ()
  {
	for(int i=0; i<10;i++)
	{
		System.out.println("Child Thread");
		
		Thread.yield();
	}		
  }
}

class ThreadYeildEx1{
		
	public static void main(String [] args)
	{
	  MyThread1 thread = new MyThread1();
	  thread.start();
	  
	  for(int i=0; i<10 ; i++)
	  {
		System.out.println("Main Thread");  
	  }
	}

}