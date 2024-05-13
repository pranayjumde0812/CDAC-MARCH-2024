class MyThread2 extends Thread
{
  public void run()
  {
	for(int i=0; i<10 ; i++)
	  {
		System.out.println("Child Thread");
	  }
  }
}

class PriorityThread2 {
	
  public static void main(String [] args)
  {
	  
	  MyThread2 thread = new MyThread2();
	  
	  thread.setPriority(10);
	  
	  thread.start();
	  
	  for(int i=0; i<10 ; i++)
	  {
		System.out.println("Main Thread");
	  }
	  
  }
}