
//give purpose delay for printing using thread
public class multithread {
	void load() {
		for(int i=1;i<=5;i=i+1) {
			System.out.println("loading");
			//manual delay should be in try_catch,otherwise it shows error
			try {
				Thread.sleep(3000);				//--->syntax for giving delay:Thread.sleep(mention_in_millisec);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	void load2() {
		for(int j=1;j<=5;j=j+1) {
			System.out.println("loading2");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		
		multithread object1=new multithread();
		object1.load();
		object1.load2();
		
	}
}

//MULTITHREADING means,if two printing is running on same,by using thread we seperate this process
class two extends Thread{
	//void load2(){
	public void run(){			//thread method should be named run() and also it should be in public
		for(int j=1;j<=5;j=j+1) {
			System.out.println("load2");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	void load1() {			//run using main() class thread,if we need thread also we can able to add
		for(int i=1;i<=5;i=i+1) {
			System.out.println("load1");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
}

public class multithread{
	
	public static void main(String[] args) {		//-->here main() also run as one thread
		
		
		
		two object1=new two();
		
		//object2.load2();	//this has 1sec delay
		object1.start(); //bcz in this,we created thread		start()<-->run()
		
		
		object1.load1();		//this has 5sec delay
		
		
		//here load1 is not waiting for load2 to complete
		//separate two loads in two different thread,lead to both run separate.load1 no need to wait for load2 completion.
		
	}
}


//in main class,we can print rest of code after thread completion
class two extends Thread{
	//void load2(){
	public void run(){
		for(int j=1;j<=5;j=j+1) {
			System.out.println("load2");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	void load1() {			//run using main() class thread,if we need thread also we can able to add
		for(int i=1;i<=5;i=i+1) {
			System.out.println("load1");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
}

public class multithread{
	
	public static void main(String[] args) {		//-->here main() also run as one thread
		
		
		
		two object1=new two();
		
		//object2.load2();	//this has 1sec delay
		object1.start(); //bcz in this,we created thread
		
	
		object1.load1();		//this has 5sec delay
		
		
		//here load1 is not waiting for load2 to complete
		//separate two loads in two different thread,lead to both run separate.load1 no need to wait for load2 completion.
		
		
		try {
			object1.join();			//this join() fn will not allow to execute rest of code in main() before thread completion
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of thread code");
		
		
	}
}



//want to know thread is still running or not
class two extends Thread{
	
	public void run(){
		for(int j=1;j<=5;j=j+1) {
			System.out.println("load2");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	void load1() {			
		for(int i=1;i<=5;i=i+1) {
			System.out.println("load1");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
		
	}
	
}

public class multithread{
	
	public static void main(String[] args) {		
		
		
		
		two object1=new two();
		
		
		object1.start(); 
		
		
		if(object1.isAlive()) {
			System.out.println("thread is running");
		}
		else {
			System.out.println("thread is not running");
		}
		
		
	
		object1.load1();	
		
		
		
		try {
			object1.join();			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end of thread code");
		
		
		
		if(object1.isAlive()) {
			System.out.println("thread is running");
		}
		else {
			System.out.println("thread is not running");
		}
		
		
		
	}
}

//multithread using interface
//this is bcz-in direct inheritance thread,we cant inheritate other classes.
class one{
	void one1() {
		System.out.println("load2");
		}
		
	}
	
class two extends one implements Runnable{
	public void run()
	{
		System.out.println("load1");
		try {
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
class multithread_interface_methode{
	public static void main(String args[]) {
		
		Runnable two = new two();
		Thread t1=new Thread(two);
		t1.start();
		
		
		one ob=new one();
		ob.one1();
	}
}




class one extends Thread{
	public void run() {
		System.out.println("load1");
		
		}
		
	}
	
class two extends one implements Runnable{
	public void run()
	{
		System.out.println("load2");
	}
	
	
}

class multithread_interface_methode{
	public static void main(String args[]) {
		one ob=new one();
		
		
		Runnable two = new two();
		Thread t1=new Thread(two);
		
		//min_priority is 1

		//norm_priority is 5

		//max_priority is 10
		
		//manually set priority throught bellow code(1,2,3....,10)
		//ob.setPriority(0);
		//t1.setPriority(10);
		
		
		ob.setPriority(Thread.MIN_PRIORITY);			//will frst print this thread
		t1.setPriority(Thread.MAX_PRIORITY);			//will secondly print this thread
		
		ob.start();
		t1.start();
		System.out.println(t1.getPriority());
		System.out.println(ob.getPriority());
		
	}
}


//synchronished
	
class answer extends Thread{
	
	synchronized void tables(int a) {	//if we run without synchronized, output like mixing of all three tables answer
										//here synchronized allow when frst thread completes its work,if frst thread printed then only move to second thread,then after third thread
		for(int i=1;i<=5;i=i+1) {
			System.out.println(a*i);
		}
		
	}
	
	
	public static void main(String args[]) {
		answer object=new answer();
		object.tables(2);
		
		Thread t1=new Thread()
				{
			public void run() {
				object.tables(5);
			}
				};
				Thread t2=new Thread() {
					public void run() {
						object.tables(10);
					}
				};
		t1.start();
		t2.start();
		
		
	}
}

