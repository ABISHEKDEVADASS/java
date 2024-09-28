import java.util.Scanner;
// print john 10times using for loop

class loop{
    public static void main(String args[]){
        for(int i=1;i<=10;i=i+1){
            System.out.println("John");
        }
    }
}

//print 1 to 10 num
class loop{
    public static void main(String args[]){
        for(int i=1;i<=10;i=i+1){
            System.out.println(i);
        }
    }
}

// print reverse 10 to 1
class loop{
    public static void main(String args[]){
        for(int i=10;i>=1;i=i-1){
            System.out.println(i);
        }
    }
}
class loop{
    public static void main(String args[]){
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();
        for(int i=a;i<=b;i=i+1){
            System.out.print(i);
        }
    }
}
// check prime num or not,count how many prime and notprime
class loop{
    public static void main(String args[]){
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();
        int count_prime=0;
        int count_notprime=0;
        for(int i=a;i<=b;i=i+1){
            
            if(i%2==0 && i%i==0){
                count_prime=count_prime+1;
                System.out.println("prime: "+i);
                

            }
            else{
                System.out.println("not a prime: "+i);
                count_notprime=count_notprime+1;

            }
        }
        System.out.println("NO.OF PRIME: "+count_prime);
        System.out.println("NO.OF NOTPRIME: "+count_notprime);
        
        
    }
}


//count hom many even numbers from 1 to 10
class loop{
    public static void main(String args[]){
        int num1 =1;
        int num2=10;
        int count=0;
        for(int i=num1;i<=num2;i=i+1){
            if(i%2==0){
                count=count+1;
            }
        }
        System.out.print(count);
    }
}


//nested for loop
      //    ***
     //     ***
    //      ***            

class loop{
    public static void main(String args[]){
        
        for(int i=1;i<=3;i=i+1){
             for(int j=1;j<=3;j=j+1){
            System.out.print("*");
        }
        System.out.println();

        }
       
    }
} 
//*
//**
//***

class loop{
    public static void main(String args[]){
for(int j=1;j<=3;j=j+1){
    for(int i=1;i<=j;i=i+1){
            System.out.print("*");
        }
        System.out.println();
}
        
       
    }
}

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

//while loop
//while loop run if condition is true,but stop when condition is false

import java.util.Random;
class loop{
    public static void main(String args[]){
int j =8;
while(j<=10) //----->run until condition gets false ,synatax:while(Condtion){enter your code}
{
    System.out.print("correct");
    j=j+1;

}
    }
}


//genrate random number until reaches 5
import java.util.Random;
class loop{
    public static void main(String args[]){
int a = 0;
while(a!=5){                    //              systax same as Scanner
    Random rand= new Random(); //----> Syntax: Random varaiable_name= new Random();
    a= rand.nextInt(10);       //---->          a= varaiable_name.nextInt(Select range for generate random ie;10 mean 1 to 9)           
    System.out.println(a);
    }
}
    }
// do while loop


//syntax=do{
//            enter code}
//        while(Condition);


//the diff between while and dowhile loop is, do while loop run atleast one time.In here,if condition true is, it will repeact do block.
 class loop{
    public static void main(String args[]){
        Scanner num= new Scanner(System.in);
        
        int a=0;
        do{
             System.out.print("Enter number greater than 10: ");
             a = num.nextInt();
            

        } while(a<10);

        System.out.println("Succesfully u entered number grester than 10");
    }
        
 }
 
 