/*Primitive datatype:
for numbers(-,+)                                                 for decimal                                for t/f         for single letter
1)byte(-128 to 127)                                      1)float(can take upto 6 to 7 digits)            1)boolean(t/f)       1)char
2)short(-32,768 to 32,767)                                  2)Double(can take upto 15 digits)
3)int(-2,147,483,648 to 2,147,483,647)
4)long(-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
*/
/* 
class datatype{
    public static void main(String args[]){
        int a =10;
        byte b =10;
        short c= 10;
        long d=10;
        float e=10.1234567f;
        double f=10.123456789012345;
        boolean g=true;
        char h='A';
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}

*/
import java.util.Scanner;
class datatype{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Long a= s.nextLong();
        if((-32768<=a) && (a<=32767)){
            System.out.println("* short");
        }
}
}