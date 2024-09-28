// challenge1-taking input from user and added to sentence
import java.util.Arrays;
import java.util.LinkedList;
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
        */
        import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        
        LocalDate date = LocalDate.of(year, month, day);
        String answ =date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        return answ;
       
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
