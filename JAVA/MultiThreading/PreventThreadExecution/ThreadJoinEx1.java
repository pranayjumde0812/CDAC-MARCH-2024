class MyThread2 extends Thread
{
   public void run()
  {
	for(int i=0 ; i< 10 ; i++)
	{
	  System.out.println("Child Thread");

	  try{	  
		  Thread.sleep(3000);  
	  }catch (InterruptedException e){}
	}
  }
}


class ThreadJoinEx1
{
  public static void main(String[] args) throws InterruptedException
  {
	MyThread2 thread = new MyThread2();
	
	thread.start();
	thread.join();
	
	for(int i=0 ; i< 10 ; i++)
	{
	  System.out.println("Main Thread");
	}
  }
}
