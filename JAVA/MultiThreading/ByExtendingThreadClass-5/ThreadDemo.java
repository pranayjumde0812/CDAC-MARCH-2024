class ThreadDemo
{
  public static void main(String... args)
  {
	  
    MyThread t = new MyThread();
	
	t.start();    // line 1
	
	System.out.println("Main - Method");
  }	  
}

// Case 7: Overriding of start () ; method but this time we use super 

// If we override start method then our start method will be executed just like a normal method call and new thread wont be created 

// but this time we use super to call our parent thread class (super.start()) it will call our Thread class start method and then our run method also get initiate 

// The whole o/p produced by main thread