/*//inheritance is one class data can able to access by another class

//single inheritance
class dad{                  //----->super class
    int money=2000;
    
}
class son extends dad{          //---->derived class

}
class inheritance{
    public static void main(String[] args){
    son object1= new son();
    System.out.print(object1.money);

    }
}

//multi level inheritance
class animal_or_not
{
    void animal(){
        System.out.print("this is animal");
    }
}
class kind_of_living extends animal_or_not
{
    void living(){
        System.out.print("this is land living");
    }
}
class name extends kind_of_living
{
    void name_of_animal(){
        System.out.print("this is dog");
    }
}
class answer{
    public static void main(String args[]){
        name obj=new name();
        obj.living();

    }
}

//heirarical inheritance
class animal_or_not             //--->superclass
{
    void animal(){
        System.out.print("this is animal");
    }
}
class dog extends animal_or_not         //---->sub class1
{
    void name(){
        System.out.print("this is dog");
    }
}
class cat extends animal_or_not         //---->sub class2
{
    void name(){
        System.out.print("this is cat");
    }
}
class answer{
    public static void main(String args[]){
        cat obj1=new cat();
        obj1.name();
        dog obj2=new dog();
        obj1.name();
    }
}
*/
//hybrid inheritance
//if multilevel and hierarical inheritance combined and come,then it will be called as hybrid inheritance

class animal          //--->superclass
{
    void animal(){
        System.out.print("this is animal");
    }
}
class dog extends animal        //---->sub class1
{
    void name(){
        System.out.print("this is dog");
    }
}
class cat extends animal        //---->sub class2
{
    void name(){
        System.out.print("this is cat");
    }
}

class white_cat extends cat{            //multi levely conected to subclass2
    void name(){
        System.out.print("this is white cat");
    }
}
class inheritance{
    public static void main(String args[]){
        cat obj1=new cat();
        obj1.name();
    
    }
}

