//garbage collection means move unused object to garbage which means dustbin.After the work of object teriminate it.

 /* 
//before garbaging object,we have to unrefference,-->

//type1 unrefferencing
public class garbage_collection{
    public static void main(String args[]){
        garbage_collection ob1=new garbage_collection();
        garbage_collection ob2=new garbage_collection();
        
        ob1.test(1);
        ob1=null;//giving null,make eligible for garbage as unused object
        ob2=null;

        System.gc();// suggesting to finazlize() for removing object
        //suggestd to garbage
        

    }

    void test(int a){
        System.out.println(a); 
    }
    
    protected void finalize() throws Throwable{//here object is deleted
        System.out.println("collected in garbage");
    }
}

//type2 of unrefferencing
public class garbage_collection{
    public static void main(String args[]){
        garbage_collection ob1=new garbage_collection();
        garbage_collection ob2=new garbage_collection();
        
        ob1.test(1);
        ob1=null;
        ob2=ob1;//giving null,make eligible for garbage as unused object

        System.gc();// suggesting to finazlize() for removing object
        //suggestd to garbage
    }

    void test(int a){
        System.out.println(a); 
    }
    
    protected void finalize() throws Throwable{//here object is deleted
        System.out.println("collected in garbage");
    }
}




*/
//Stack vs heap
/* Stack work based on LIFO->list in and frst out.accessing is very fast.Memory allocation happend during compiled*/
/*Heap works based on FIFO->first in first out.accessing is very slow.Memory allocation happens during runtime */


import java.util.ArrayList;
import java.util.List;

public class MemoryLeakExample {
    // Static list to hold objects
    private static List<Object> objectList = new ArrayList<>();
    
    public static void main(String[] args) {
    
        for (int i = 0; i < 1000000; i++) {
            // Adding new objects to the list
            objectList.add(new Object());
            
        }
        objectList=null;
        
        // The objects in objectList are never removed, causing a memory leak
        System.out.println("Added 1,000,000 objects to the list.");
        System.out.println(objectList);
    }
}
