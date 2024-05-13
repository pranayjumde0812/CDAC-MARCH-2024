class ThreadDemo
{
  public static void main(String... args)
  {
	  
    MyThread t = new MyThread();
	
	t.start();    // line 1
	
	t.run(9);     // line 2
	
  }	  
}

// Case 4: Overloading of run () ; method

// Override of run method is always possible but thread class start method can invoke NO - Argument run method  ---> Line 1

// The other overloaded method we have to call explicitly like normal method call  --->  Line 2