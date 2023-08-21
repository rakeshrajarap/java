package multithreading;

public class datainconsistancy {

	public static void main(String[] args) {
		students s = new students();
		Thread t1 = new Thread(s,"thread 1");
		t1.start();
		Thread t2= new Thread(s,"thread 2");
		t2.start();
		

	}
}
class students implements Runnable
{
    int count;
	@Override
	public void run()
	{
		for(int x=0;x<10;x++)
		System.out.println(Thread.currentThread().getName()+"=====>"+(++count));
		
	}
	
}