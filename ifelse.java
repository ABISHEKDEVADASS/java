//ifelse 
import java.util.Scanner;

class ifelse{
    public static void main(String args[]){
        Scanner wheather = new Scanner(System.in);
            String a = wheather.nextLine();
               if( a.equals("raining"))       // for new string comparision dont use (==) operator,use .equals()
        {
            
            System.out.print("Take umberlla");
        }
        else
        {
            System.out.print("enjoy the sun");
        }

    
    }
}

//String comparision
    
    class ifelse{
        public static void main(String args[]){
            String a = "apple";
            String b = "apple";
            
            String c= new String("apple");
            String d= new String("apple");      
            
            System.out.println(a==b);          
            System.out.println(c.equals(d));    //use .equal() for new string
              }
    }

    //ternary operator(used insead of if else method),  Synatx: variable = condition?"valueifTrue":"ValueifFalse";
    class ifelse{
        public static void main(String args[]){
            System.out.print("Enter: ");
           Scanner wheather=new Scanner(System.in);
            String climate =wheather.nextLine();
            String a= climate.equals("raining")?"take umberalla":"enjoy the sun";
            System.out.print(a);

        }
    }
    