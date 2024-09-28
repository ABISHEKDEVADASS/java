
//abstract is used to hide class from user,but developer us can access it.e.g.(below)
//user only know the car accelerator,car manufator us know every inside it and we can make there but user cant
//abstract class
// we cannot create object for abstract class,we can only acccess this abstract by multilevel inheritance

abstract class computer_status{
	String a="com is on";
}
class computer_name extends computer_status{
	String b="this is hp";
	
}
public class abstract_class{
	public static void main(String args[]) {
		computer_name object= new computer_name();
		System.out.println(object.a);
	}


}

