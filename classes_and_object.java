//class will work as template and through object we can use that template.
//object created for accessing code in out of main()
/*class{
        } -----> template
public static void(){
        object ------> edit template and creat multiple by edit template
}
*/
 
class laptop{            

    //template
    String name="Enter laptop Name";
    String Processor="Enter Processor name";
    int ram=0;
    int price=0;

    public static void main(String args[]){

        laptop lap1= new laptop();      //---->object1 for creating first lap spec using template
        lap1.name="acer";
        lap1.Processor="i5";
        lap1.ram=16;
        lap1.price=53000;
        
        
        laptop lap2= new laptop();      //---->object2 for creating second lap spec using template
        lap2.name="HP";
        lap2.Processor="ryzn5";
        lap2.ram=8;
        lap2.price=50000;

        System.out.println(lap1.name);
        System.out.print(lap2.name);
    }
}