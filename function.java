// function cannot acces--> static to non static function
//functio can access ---> static to static /(or) static --> object ---> non stati

// syntax for creating function:    (static if needed)void function_name() {enter code here}

class bank{
    void sbi(){
        System.out.println("this is sbi bank");
    }

    void iob(){
        System.out.println("this is iob bank");
    }
    static void canara(){
        System.out.print("this is canara bank");
    }

    public static void main(String args[])
    {
        //creating object for accesing non static function
        bank object=new bank();
        object.sbi();
        object.iob();

        //no need object help,because canara() is static so we can directly access it
        canara();

    }
}


// question2 
class Addition{
    int a=10;
        int b=10;
    
void sum(){
        
        System.out.print(a+b);
    }
    public static void main(String args[]){
        Addition obj = new Addition();
        obj.sum();
    }
}

//functions with parameter
//1]e.g: here u r puchasing hamam for RS.10 and lifeboy for Rs.20
 class supermarket{
    void hamam(int money_for_hamam) //----> void variable_name(parameter){Enter Code Here}
    {
        System.out.println("hamam soap is purchased");
        System.out.println(money_for_hamam);
    }
    void lifeboy(int money_for_lifeboy){
       System.out.println("lifeboy soap is purchased");
       System.out.println(money_for_lifeboy);
 }
    public static void main(String args[]){
        supermarket purchase_soap = new supermarket();
         purchase_soap.hamam(10);
         purchase_soap.lifeboy(20);
    }
 }
 
// 2]create a function sum(),get two num from main() and add those two num by using sum()
class Addition{
    void sum(int num1,int num2){
        System.out.print(num1+num2);
    }
    public static void main(String args[]){
        Addition num = new Addition();
        num.sum(2,3);
        

    }
}


//check user input number is even or odd
import java.util.Scanner;
class find{

     String evenorodd(int users_num){
        
        int answer=users_num;
        if(answer%2==0){
            String a="even";
            return a;
        }
        else{
            String b="odd";
            return b;

        }
    }
    public static void main(String args[]){
        Scanner UserInput=new Scanner(System.in);
        int num=UserInput.nextInt();
        

        find object=new find();
        String final_ans=object.evenorodd(num);
        System.out.println(final_ans);

    }
}

//checking student is pass or fail
import java.util.Scanner;
class find{

     String passorfail(int users_num){
        
        int answer=users_num;
        if(answer>=35){
            String a="pass";
            return a;
        }
        else{
            String b="fail";
            return b;

        }
    }
    public static void main(String args[]){
        Scanner UserInput=new Scanner(System.in);
        int mark=UserInput.nextInt();
        

        find result=new find();
        String final_result=result.passorfail(mark);
        System.out.println(final_result);

    }
}

//method over loading or funtion overloading
//eg.you want to add num,but u dont know how many number are input
//function name can be same,but same conditon for same function name is not allowed

class method_overloading{
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.print(a+b+c);

    }


    public static void main(String args[]){
       
        method_overloading add =new method_overloading();
        add.sum(1,2);
        add.sum(1,2,3);



    }
}

// contructor overloading
//object is called as constructor
//here object will work as a call element

class constructor_example{

    constructor_example(){       //---->dont use void before constructor name
        System.out.println("test code");
    }
    
    constructor_example(int a){     //---->dont use void before constructor name
        int answer=a;
        System.out.print("test code:"+answer);
    }
    public static void main(String args[]){
        constructor_example object1= new constructor_example();  //-->object or constructor
        constructor_example object2= new constructor_example(1);  //-->object or constructor
    }
}


//consrtructor initialize the data
class constructor{
    int mark;       // constructor defaultly set as 1 for integer
    String Name;    // constructor defaultly set as null for String
    public static void main(String args[]){
        constructor call= new constructor();
        System.out.println(call.mark);
        System.out.println(call.Name);
    }
}
