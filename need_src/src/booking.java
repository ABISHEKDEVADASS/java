import java.util.*;
import java.lang.*;
class bus{
    int BUSNO=01;
    boolean check(int from_user){
        if(BUSNO==from_user){
            return true;
        }
        else{
            return false;
        }
    }


}

class booking {
    public static void main(String[] args) {
     
       
        Scanner scan=new Scanner(System.in);
        bus ob=new bus();
        

        System.out.print("Enter or Exit: ");
        String intro=scan.nextLine();
        if(intro.equals("Enter")){
            System.out.print("Enter bus Number ");
            int bus_number=scan.nextInt(); 
            if(ob.check(bus_number)){
                System.out.println("Booked");
            }
            else{
                System.out.println("failed");
            }
        }
        

    }
}
