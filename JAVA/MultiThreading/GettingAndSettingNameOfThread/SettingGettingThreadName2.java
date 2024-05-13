class SettingGettingThreadName2{
	
	public static void main(String [] args)
	{
		MyThread2 t = new MyThread2();
		t.start();
		
		System.out.println("Main method executed by Thread : "+Thread.currentThread().getName());
	}

}

class MyThread2 extends Thread
{
	public void run()
	{
		System.out.println("Run method executed by Thread : "+Thread.currentThread().getName());
	}
}