//adding two numbers from user input
import java.util.Scanner;   //put this line only when user input takens
class UserInput{
    public static void main(String args[]){
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in);
        int a = num1.nextInt();
        int b = num2.nextInt();
        int c = a+b;
        System.out.print(c);
    }
}
//adding two text from user input
 class UserInput{
    public static void main(String args[]){
        Scanner word1 = new Scanner(System.in);
        Scanner word2 = new Scanner(System.in);
        String a = word1.nextLine()+" "+word2.nextLine();
        System.out.print(a);
    }
 }