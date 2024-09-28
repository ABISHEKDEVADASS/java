
//this private key element cannont access by anyone out of that class,only way to access from outside class is (getter and setter)
class integer{
    
	 private int ab=69;

	public int getA() {
		return ab;
	}

	public void setA(int a) {
		this.ab = a;
		System.out.println(ab);
	}

}
public class encapsulation{
	public static void main(String args[]) {
		integer object=new integer();
		//if you want to see private element
		 
		 
		 int getter=object.getA();		//uncommand and use
		System.out.print(getter);
		
		
		 
		
		//if ypu want to overwrite the priavte element
		  
		  
		// object.setA(50);					//uncomand and use
		 
		 
	
		
	}
	
}
