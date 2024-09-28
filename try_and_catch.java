

//try,catch
// if any error in code,code will stop at there and not run further.if we have doubt in any code,make it try and catch,then it will run futher also having error
public class try_and_catch
{

	public static void main(String[] args) {
		int a=0;
		int b=2;
		int c=0;
		try{
			 c=b/a;			//----here is a error,bcz 2/0=not possible
			 System.out.println("code run succesfully");		
		}
		catch(Exception e) {
			System.out.println("error occured");
		}
		System.out.println(c);
	}

}

//throw eg1
public class try_and_catch {
    public static void main(String[] args) {
        try {
            validateUsername("");
        } catch (IllegalArgumentException e) {
            System.out.println("error raised");
        }
    }

    static void validateUsername(String username) {
        if (username.isEmpty()) {
            throw new IllegalArgumentException("Username cannot be empty.");
        } else {
            System.out.println("Username is valid.");
        }
    }
}

//throw eg2 
class try_and_catch{
	public static void roll_num(int roll_no) {
		if(roll_no>=51){
			
				throw new ArithmeticException("error");
		}
			
		
	}
	public static void main(String args[]){
		try{
			roll_num(55);
		}
		catch(ArithmeticException E){
			System.out.println("error:"+E.getMessage());
		}
	}
}

//finally
class try_and_catch{
	public static void main(String args[]) {
		try {
		int a=99/0;
		} catch(Exception variable) {
			System.out.println("error occured: "+variable);
		}
		finally{
			System.out.println("what ever happens i will run");
		}
		
	}
}


