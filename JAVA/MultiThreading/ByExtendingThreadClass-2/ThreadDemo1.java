class ThreadDemo1 
{
  public static void main(String... args)
  {
    MyThread t = new MyThread();
	
//	t.start();                         line 1
	
	t.run();                     //    line 2
	
	// main thread
	for(int i=0; i<10 ;i++)
	{
		System.out.println("Main Thread class");
	}
  }	  
}

// Case 2:  Difference between t.start(); and t.run();

//  In th case of t.start() ; a new thread will be created which is responsible for execution of run method 
//  But in case of t.run(); a new thread won't be created and run method will be executed just like normal method call by Main method


// When line 2 is using then the whole output is produced by only main method 