public class generic_method {
    
    <T> void one(T[] array){
        for(T i: array){
            System.out.print(" "+i);
        } 
        System.out.println();

    }
   public static void main(String args[]){
    String[] st={"one","two"};
    Integer[] num={1,2};
    generic_method ob=new generic_method();
    ob.one(st);
    ob.one(num);
   }
}
