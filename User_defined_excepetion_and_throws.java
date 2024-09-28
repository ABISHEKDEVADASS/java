import java.util.Scanner;
class user_defined_exception extends Exception{     //creared an user defined exception which means manualy created exception
    user_defined_exception(String a){
        super(a);
    }
}
class User_defined_excepetion_and_throws {
    void User_defined_exception_and_throws(int age) throws user_defined_exception{
        if(age<18){
            throw new user_defined_exception("not eligible to vote");
        }
        else{
            System.out.println("eligible to vote");
        }
    }
    public static void main(String args[]) {
        User_defined_excepetion_and_throws object=new User_defined_excepetion_and_throws();
        try{
            
            object.User_defined_exception_and_throws(15);
        }
        catch (user_defined_exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
