//compile time polymorphism
//it is a method overloading
//rule:same class, same method name, different parameter

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

//run time polymorphism 
//it ia a method overriding
//rule:diff class(inheritance),same method name,same parameter
class dad{ 
    void money(){int money1=2000;}                 //----->super class
    
    
}
class son extends dad{ 
    void money(){int money2=3000;}         //---->derived class

}
class inheritance{
    public static void main(String[] args){
    son object1= new son();
    object1.money1();
    object1.money2();
    }
}
