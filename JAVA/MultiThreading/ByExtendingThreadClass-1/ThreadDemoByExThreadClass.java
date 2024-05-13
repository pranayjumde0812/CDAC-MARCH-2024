class ThreadDemoByExThreadClass
{
  public static void main(String [] args)
  {
    MyThread t1 = new MyThread();
	
	t1.start();
	
	// Main thread
	
	for(int i = 0; i < 10 ; i++)
	{
		System.out.println("Main Thread Class");
	}
  
  }
}