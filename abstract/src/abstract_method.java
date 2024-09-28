// abstract method
abstract class computer_status{
	abstract void status_off();			//--->this is abstract method,there is no use for this void,but we can over write in future(Line32)
	void status_on() {
		System.out.println("turn on");
	}
}
class computer_name extends computer_status{
	void name() {
		System.out.println("turn_on hp");
	}
	void status_off() {
		System.out.println("turn_off hp");
	}
	
}
public class abstract_method{
	public static void main(String args[]) {
		computer_name object= new computer_name();
		object.status_off();
	}


}

