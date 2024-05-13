class ThreadDemo
{
  public static void main(String... args)
  {
	  
    MyThread t = new MyThread();
	
	t.start();    // line 1
	
	System.out.println("Main - Method");
  }	  
}

// Case 6: Overriding of start () ; method

// If we override start method then our start method will be executed just like a normal method call and new thread wont be created 

// It is not recommended to override start() method Otherwise dont go for multithreading concept 

// The whole o/p produced by main thread