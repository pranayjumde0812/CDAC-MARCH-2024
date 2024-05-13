class MyThread1 extends Thread{

}

class SettingGettingThreadName1{
	
	public static void main(String [] args){
		System.out.println(Thread.currentThread().getName());
		
		MyThread1 thread = new MyThread1();
		
		System.out.println(thread.getName());
		
		Thread.currentThread().setName("Rama");
		
		System.out.println(Thread.currentThread().getName());
	}
   
}