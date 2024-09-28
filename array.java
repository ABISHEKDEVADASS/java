//playlist[3]----->three array box but possition is different

_____________________________________________________________
|array1        |array2                |array3               |
|______________|______________________|_____________________|
    position0           positon1                position2


//array type1 to store data in it.
class array{
    public static void main(String args[]){
        String[] playlist= new String[3]; //---->//syntax:datatype[] NameOfVariable= new datatype[total-space of array]
        playlist[0]="song1";
        playlist[1]="song2";
        playlist[2]="song3";
        System.out.println(playlist[0]);
        System.out.println(playlist[1]);
        System.out.println(playlist[2]);
    }
}
//array type2 for store data in it
class array{
    public static void main(String args[]){
        String[] playlist= {"song1","song2","song3"};       //syntax:datatype[] NameOfVariable={data1,data2,data3....} ----->we can use (int,...) instead of String
        System.out.println(playlist[0]);
        System.out.println(playlist[1]);
        System.out.println(playlist[2]);
        
    }
}
//get user input and store it directly into array,add all the data in array
import java.util.Scanner;
class array{
    public static void main(String args[]){
       Scanner number = new Scanner(System.in);
       int[] num= new int[5];
       num[0]=number.nextInt();
       num[1]=number.nextInt();
       num[2]=number.nextInt();
       num[3]=number.nextInt();
       num[4]=number.nextInt();
       System.out.print(+num[0]+num[1]+num[2]+num[3]+num[4]);
    }
}

//get 5 num as input in array using for loop
import java.util.Scanner;
class array{
    public static void main(String args[]){
        Scanner fivenum = new Scanner(System.in);
        int[] marks= new int[5];
        
        for(int i=0;i<=4;i=i+1){
            marks[i]= fivenum.nextInt();    
        } 
        for(int i=0;i<=4;i=i+1){
            System.out.println(marks[i]);
            
        } 

    }
}

// print array using for loop
class array{
    public static void main(String args[]){
        int[] ten= new int[10];
        ten[0]=1;
        ten[1]=2;
        ten[2]=3;
        ten[3]=4;
        ten[4]=5;
        ten[5]=6;
        ten[6]=7;
        ten[7]=8;
        ten[8]=9;
        ten[9]=10;

        for(int i=0;i<=9;i=i+1){
            System.out.println(ten[i]);
            }
        
    }
    }

    
// print maths tables using for loop
import java.util.Scanner;
class array{
    public static void main(String args[]){
        String b="ENTER WHICH TALES YOU WANT: ";
        System.out.print(b);
        Scanner num= new Scanner(System.in);
        int a = num.nextInt();

        for(int i=1;i<=20;i=i+1){
            int c=a*i;
            System.out.println(i+"X"+a+"="+c);

        }

    }
}

//get input for size of array,get input for each element in array,find and print middle value of an array
import java.util.Scanner;
class array{
    public static void main(String args[]){
        String b="ENTER seize of array: ";
        System.out.print(b);
        Scanner num= new Scanner(System.in);
        int a = num.nextInt();
        int[] array= new int[a];
        

        for(int i=0;i<a;i=i+1){
            array[i]=num.nextInt();
        }
        int middle_value =a/2;
        System.out.print(array[middle_value]);

    }
}

//used to print all values in array
//for each loop or advanced for loop
 //use when handling with array
 //syntax:for(datatype  random_varaibale(e.g:a)   :        array_name){System.out.print(a)}

 class for_each_loop{
    public static void main(String args[]){
        int[] array= {1,2,3,4,5,6};

        for(int random_variable:array){
            System.out.println(random_variable);
        }

    }
 }


//printing an complete array by passsing to method
 public class generic_method {

    public static  void one(String[] array){
        for(String i: array){
            System.out.println(i);
        } 

    }
   public static void main(String args[]){
    String[] st={"one","two"};

    generic_method ob=new generic_method();
    ob.one(st);
   }
}
