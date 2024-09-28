//there are three in build annotaion->@override,@Deprecated,@SuppressWarning
//override ->@Override: Indicates that the method is overriding a method in the superclass. If the method does not actually override a method in the superclass, the compiler will generate an error
/* 
class override_learn1{
    void one(){
        
        System.out.println("hi1");
    }
    }
    
    class override_learn2 extends override_learn1{
    @Override
    void one(){
       System.out.println("hi2");
    }
    }
    class Annotaion{
        public static void main(String[] args) {
            override_learn2 ob=new override_learn2();
            ob.one();
        }
    }
      
//@Deprecation->if this annotation assigned to a method,that method is no longer used-if we use that deprecation method,it shows warning
//@Deprecated: Marks a method (or other element) as deprecated, meaning it should no longer be used. The compiler generates a warning whenever the deprecated method is used.
class one{
    @Deprecated
    void call(){
        System.out.println("hello1");
    }
}
class two extends one{
    void hello(){
        //while creating this call,it showing warning
        call();
    }
}

class Annotaion{
    public static void main(String[] args) {
     two ob=new two();
     ob.call();   
    }

}
 */

 //@SuppressWarnings(Enter kind of warning) ->