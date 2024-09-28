//this code and below code are same,advantage of below code is there we can inheritate someother classses
/*//1
abstract class vehicel{
 abstract void status();    //--if method is empty then it should be in abstract
}
class car extends vehicel{
    public void status(){
        System.out.println("car is on road");
    }
}
class bike extends vehicel{
    public void status(){
         System.out.println("bike is on road");
    }
}
class mechanic{
    void status(vehicel v){
            v.status();
        
    }
}
class interface_learn{
    public static void main(String args[]){
        mechanic m=new mechanic();
        car c=new car();
        bike b=new bike();
        m.status(c);
        m.status(b);

    }
}
*/


//2
interface vehicel{
 void status();     //--->defaulty it has public abstract  //teeling what to print but not how to print
}
class car implements vehicel{
    public void status(){       //should be public bcz vehicel's method is public
        System.out.println("car is on road");
    }
}
class bike implements vehicel{
    public void status(){           //should be public bcz vehicel's method is public
         System.out.println("bike is on road");
    }
}
class mechanic{
    void status(vehicel v){
            v.status();
        
    }
}
class interface_learn{
    public static void main(String args[]){
        mechanic m=new mechanic();
        car c=new car();
        bike b=new bike();
        m.status(c);
        m.status(b);

    }
}
