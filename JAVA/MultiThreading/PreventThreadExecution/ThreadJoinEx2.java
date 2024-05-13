class MyThread3 extends Thread
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


class ThreadJoinEx2
{
  public static void main(String[] args) throws InterruptedException
  {
	MyThread2 thread = new MyThread2();
	
	thread.start();
	thread.join(15000);
	
	for(int i=0 ; i< 10 ; i++)
	{
	  System.out.println("Main Thread");
	}
  }
}