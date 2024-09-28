// Define a generic method with bounded type parameter
//used to restrict data type
//user input maybe in int or double,we can set only one data type,to solve this isssues,we restruct condition is data type(Number)
//instead Number,we can use any data type like string,char,Double etc..
public class generic_method_with_bounded_type_parameter
 {
    public static <T extends Number>void printSum(T a,T b) {
            System.out.println(a.doubleValue()+b.doubleValue());
        
        
    }

    public static void main(String[] args) {
        printSum(12,5.5); // Output: 30.0
        // The following line will cause a compile-time error because String is not a subclass of Number
        // printSum("10", "20");
    }
}

