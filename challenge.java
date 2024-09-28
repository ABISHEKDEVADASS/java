// challenge1-taking input from user and added to sentence
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.naming.LinkRef;
/*
class challenge{
    public static void main(String args[]){
        Scanner name = new Scanner(System.in);
        Scanner age = new Scanner(System.in);
        String a = "my name is"+" "+name.nextLine();
        String b = "my age is"+" "+age.nextLine();
        System.out.println(a);  //println is used to creat new line after a is printed
        System.out.print(b);
    }
}

//challenge2
class challenge{
    public static void main(String args[]){
     Scanner a1 = new Scanner(System.in);
     Scanner b1 = new Scanner(System.in);
     Scanner c1 = new Scanner(System.in);
     int a=a1.nextInt();
     int b=b1.nextInt();
     int c=b1.nextInt();
     int d = a*b*c;
     int e = a+b+c;
     System.out.print(d/e);
     }
}
 //Challeng-3
class challenge{
    public static void main(String args[]){
     Scanner score = new Scanner(System.in);
     Double a= score.nextDouble()/10;
     System.out.println("my score is "+a);
     }
}

//challenge-4 checking whether pass or nor
class challenge{
    public static void main(String args[]){
        Scanner mark = new Scanner(System.in);
        int a=mark.nextInt();
        
        if(a>=35){
            System.out.print("Your Are Pass");
        }
        else{
            System.out.print("Your are failed");
        }

    }
}

// checking5 user given number is divisible by both 3 and 5 or not
class challenge{
    public static void main(String args[]){
        Scanner random_number = new Scanner(System.in);
        int a=random_number.nextInt();
        
        if(a%3==0 && a%5==0){
            System.out.print("u r PASS");
            
            
        }
        else{
            System.out.print("Your are failed");
        }

    }
}
// checking6 odd or even
class challenge{
    public static void main(String args[]){
        Scanner random_number = new Scanner(System.in);
        int a=random_number.nextInt();
        
        if(a%2==0){
            System.out.print("number is even");
  
            
        }
        else{
            System.out.print("number is odd");
        }

    }
}

import java.util.Scanner;
class game{
    public static void main(String args[]){
        int acc_no= 1234567890;
        String acc_holder_name="Abishek";
        int acc_balance=53000;

        Scanner user=new Scanner(System.in);
        
        String b="Enter ACC_Holder_Name"+user.nextLine();
        int a=user.nextInt();
        int c=user.nextInt();
        
        


    }
}

package asd;

public class practice {
//1
	public static void main(String[] args) {
		//*
		 //* 1
		 //* 1 2
		 //* 1 2 3
		 //* 1 2 3 4
		 //* 1 2 3 4 5
		 
	for(int j=1;j<=5;j=j+1) {
		
		for(int i=1;i<=j;i=i+1) {
			System.out.print(i);		
		}
		System.out.println("");
	}
	}
	}

    //
    import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class StreamTypesExample {
    public static void main(String[] args) {
        // Object Stream
        Stream<String> stringStream = Stream.of("a", "b", "c");
        List<String> upperCaseStrings = stringStream.map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCaseStrings); // Outputs [A, B, C]

        // IntStream
        // Outputs 10 (1+2+3+4)

        // LongStream
        
        // DoubleStream
        DoubleStream doubleStream = DoubleStream.of(1.1, 2.2, 3.3);
        double average = doubleStream.average().orElse(0.0);
        System.out.println(average); // Outputs 2.2

        // Parallel Stream
        List<String> list = Arrays.asList("a", "b", "c", "d");
        list.parallelStream().forEach(System.out::print); // Outputs elements in parallel
    }
}*/
/**
 * challenge
 
//leet code (add two)
public class challenge {

    public static void main(String[] args) {
        
        LinkedList<Integer> ll=new LinkedList<>();
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        ll.add(a);
        ll.add(b);
        ll.add(c);
        String variable1= Integer.toString(c)+Integer.toString(b)+Integer.toString(a); 
        int variable2=Integer.parseInt(variable1);

        LinkedList<Integer> ll2=new LinkedList<>();
        
        int e=s.nextInt();
        int f=s.nextInt();
        int g=s.nextInt();
        ll2.add(e);
        ll2.add(f);
        ll2.add(g);

        String variable3= Integer.toString(g)+Integer.toString(f)+Integer.toString(e); 
        int variable4=Integer.parseInt(variable3);
        int l=variable2+variable4;
        
        String con=Integer.toString(l);

        int aa=l%10;
        int bb=(l/10)%10;
        int cc=(l/10)/10;

        String ss=Integer.toString(aa)+Integer.toString(bb)+Integer.toString(cc);
        
        
        LinkedList<String> aaaa=new LinkedList<>();
        aaaa.add(ss);
        System.out.println(aaaa);

        
    } 

}

class challenge
{
    static void call(int[] nums,int target){
        for(int a:nums){
            if (a<=9){
                call2(a);
            }
        }
        
        
    }
    static void call2(int b)
    {
        
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        call(nums,target);
    }
    
}


public class Solution {

    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        int l=1;
       while(s.hasNextLine()){
        String a=s.nextLine();
        System.out.println(l+" "+a);
        l++;
       } 
    }
    
   
}
    
    //writing method in main 
    class challenge{
        public static int a;
        static{
            a=1;
        }
        public static void main(String[] args) {
            System.out.println("hi "+a);
        }
    }

class challenge{
    public static void main(String[] args) {
        String a="123";
        int b=Integer.parseInt(a);
        if(b<999){
            System.out.println(b);
        }
        
    }
}
    
    class challenge{
        static void call(String vv){
            char b=vv.charAt(0);
            char c=Character.toUpperCase(b);
            System.out.print(c);    
            for(int i=1;i<=vv.length()-1;i++){
                System.out.print(vv.charAt(i));
                if(vv.isEmpty()){
                    System.out.print(" ");
                }
                
            } 
        }
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
        
          
          int len=0;
          
          while(s.hasNextLine()){
            String a=s.nextLine();
            System.out.println();

            if (a.isEmpty()) {
                break; // exit loop if the input is empty
            }
            call(a);
            
            
          }
          
          
         }
         static void call1(int cc){
            System.out.println(cc);
         }
           }
           
          
          //checking which alphabet is greater
         class challenge{
            public static void main(String[] args) {
                String a="Apple";
                String b="Banana";
                System.out.println(b.compareTo(a)>0 ? "yes":"No");

            }
         }
            
//unicode finder
    class challenge{
        public static void main(String[] args) {
            char a='h';
            char c='j';
            int b=(int)a;
            int d=(int)c;
            System.out.println(b);
            System.out.println(d);
        }
    }
        
        import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;

class Result {


    public static String findDay(int month, int day, int year) {
        
        
    }

}

public class challenge{
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class challenge{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        int day=s.nextInt();
        int month=s.nextInt();
        
    }
}
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class challenge{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();//1232413
        scanner.close();

        // Write your code here.
        Locale indiaLocale = new Locale("en", "IN");
        
      NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
       NumberFormat india=NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
         NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}

//Sample Input

//Helloworld
//0123456789
//3 7
//Sample Output

//lowo 
class challenge{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int b=s.nextInt();
        int c=s.nextInt();
        System.out.println(a.substring(b,c));
    }
}

//Sample Input 0

//welcometojava
//3
//Sample Output 0

//ava
//wel


import java.io.*;
import java.util.*;



public class challenge {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        
        if(Palindrome(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
       
        
    }
    static boolean Palindrome(String str){
        
        // Enter your code here. Print output to STDOUT. 

       System.out.println(str);
        String a=new java.lang.StringBuilder(str).reverse().toString();
        boolean x=str.equals(a);
        return x;
    }
}

import java.util.*;
import java.util.concurrent.*;
import java.util.function.DoubleUnaryOperator;
import java.util.regex.*;

import java.time.LocalDate;
import java.time.format.TextStyle;

public class challenge {
    

    public static String  getSmallestAndLargest(String s, int k) {
       
        String small=s.substring(0, k);
        String large=s.substring(0, k);
        
        
        for (int i = 0; i <= s.length()-k; i++) {
            String a = s.substring(i, i + k);
            
            if(a.compareTo(small)<0)small=a;
            if(a.compareTo(large)>0)large=a;
           }
           return small+"\n"+large;
           
           

        }
        
    


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        getSmallestAndLargest(s, k);
    }
}




public class challenge {

   

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        
        String c=a.toLowerCase();
        String d=b.toLowerCase();

        char[] e=c.toCharArray();
        char[] f=d.toCharArray();
        boolean ret;
        Arrays.sort(e);
        Arrays.sort(f);
        if(e.length!=f.length){
            ret=false;
        }
        if(Arrays.equals(e, f)){
            ret=true;
        }
        else{
            ret=false;
        }
       
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

import java.lang.String;


class challenge{
    
    
    public static void main(String[] args) {
        String a="He is a very very good boy, isn't he?";
        String b=a.replaceAll("\\p{Punct}", " ").replaceAll("\\p{Punct}", "");
        String[] c=b.split(" ");
        int count=0;
        for(String d:c) {
           
            if(d.isEmpty()){
                System.out.print("");
            }else{
                count++;
        
                
            }
            
            
           
        }
        
        System.out.println(count);
        //2
        for(String d:c) {
           
            if(d.isEmpty()){
                System.out.print("");
            }else{
                count++;
                
                System.out.println(d);
                
            }
            
           
        }
     
        
    }
}



import java.util.*;

class challenge{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BigInteger a=s.nextBigInteger();
        BigInteger b=s.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
    
    class one{
        one(){
            System.out.println("isvi");
        }

    }
    class two extends one{
        super.one();
       two(){
            System.out.println("two");
        }

    }
    class Solution{
        public static void main(String[] args) {
            two ob=new two();
        }
    }
        
        import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
        class challenge{
            static String call(String c){
                
                try {
                    Pattern.compile(c);
                    return "Valid";
                    
                } catch (PatternSyntaxException e) {
                   return "Invalid";
                }
            
        

            }
            public static void main(String[] args) {
                Scanner s=new Scanner(System.in);
                int a=s.nextInt();
               s.nextLine();
                for(int i=1;i<=a;i++){
                    String b=s.nextLine();
                    
                    System.out.println(call(b));
               
                
                }
                    
                }
                }
                
                import java.io.*;
import java.util.*;

class Soccer{
    
    static String hi(){
        return "Soccer Class";
    }
}


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class challenge {
    public static void main(String[] args) throws IOException {
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      ArrayList<Integer> c=new ArrayList<>();
      for(int i=1;i<=a;i++){
        int b=s.nextInt();
        c.add(b);
      }
      
      System.out.println(c);
    }
}

class challenge{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        
        for(int i=1;i<=a;i++){
            int b=s.nextInt();
            
            
        }
    }
}
                
 
class challenge{
    public static void main(String[] args) {
        String a="33 Rumpa 3.68";
String b="85 Ashis 3.85";
String c="56 Samiha 3.75";
String d="19 Samara 3.75";
String e="22 Fahim 3.76";
String f=" ";
for(int i=a.length()-1;i<=5;i--){
    System.out.println(a.charAt(i));
    
}

    }
}       
    
    import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    
    while(s.isEmpty()){
     String a=s.nextLine();
     if(a.length()<8){
         System.out.println("Invalid")
     } 
     if(a.contains('?')){
        System.out.println("Invalid");
     }
     if(!charcter.isalphabet(a.charAt(0))){
        System.out.println("Invalid");
     }
     else{
        System.out.println("Valid");
     }
    }
    
    
    
    }
}

class challenge{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        s.nextLine();
        while(a-- !=0){
            String b=s.nextLine();
        
            String c=b.replaceAll("<//w>","");
            System.out.println(c);
            
            
        }
    }
}*/
class challenge{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Scanner s2=new Scanner(System.in);
        int a=s.nextInt();
        while(a--!=0){
            int b=s.nextInt(); 
        }
        int c=s.nextInt();
        while(c--!=0){
            String q=s2.nextLine();
            int q1=s.nextInt();
            int q2=s.nextInt();
        }
    }
}