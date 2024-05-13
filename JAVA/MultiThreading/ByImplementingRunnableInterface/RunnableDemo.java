class RunnableDemo
{
	public static void main(String... args)
	{
      MyRunnable r = new MyRunnable();
	  
	  Thread t = new Thread (r);
	  
	  t.start();
	  
	  for(int i=0; i<10; i++)
	  {
		System.out.println("Main Thread");  
	  }
	}		
	
}


//  Among 2 ways of defining a Thread implements Runnable approch is recommended.

// In the first approch our class always extends Thread class , there is no chance of extending any other class
// Hence we are missing inhertance benefits


// But In Second approch we are implementing the Runnable interface so we can extends another class.
// Hence we wont miss any inheritance benefits.

// Because of above reason we prefer to use Runnable interface here.