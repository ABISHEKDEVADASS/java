/*
//functional interface-lamda expression
interface lam{
    void test();
}
public class lambda_expression {
    public static void main(String[] args) {
        lam ob=() -> System.out.println("num added");
        ob.test();
    }   
}

//passing values

interface lam{
    void test(int a);
}
public class lambda_expression {
    public static void main(String[] args) {
        lam ob=a -> System.out.println("num added: "+a);
        ob.test(5);
    }   
}

*/

interface hi{
    void call(int a,int j);}
 public class lambda_expression {
    public static void main(String[] args) {
        hi ob=(a,b)->{
            int c=a*b;
            System.out.println(c);
            return;
        };
        ob.call(10,15);
    }
    }