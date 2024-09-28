
/* 
//returning the balance amount to customer after soap purchasing
class supermarket{
    int hamam_soap(int customer_money){     //-----> use required datatype instead of void,bcz return will not work in void
        int hamam_soap_price=35;
        int return_amount=customer_money - hamam_soap_price;
        return return_amount;           //---->this return number replace whole line(17) and save return amount there

    }
    int lifeboy_soap(int customer_money){
        int lifeboy_soap_price=40;
        int return_amount=customer_money - lifeboy_soap_price;
        return return_amount;   //---->this return number replace whole line(18) and save return amount there

    }
    public static void main(String args[]){
        supermarket purchase_soap=new supermarket();
        int order1=purchase_soap.hamam_soap(40);
        int order2=purchase_soap.lifeboy_soap(50);

        System.out.println(order1);
        System.out.print(order2);

    }
}


// take two num from function main(),add them in function sum(),print answer in function main() using return.
class Addition{

    int sum(int num1,int num2){
        int solution=num1+num2;
        return solution;
    }
    public static void main(String args[]){
        Addition problem= new Addition();
        int answer=problem.sum(10,20);
        System.out.print(answer);

    }
}
    */


    class return_learn{
        public static void main (String args[]){
            
            for(int i=1;i<=5;i=i+1){
            System.out.println(i);
            return;     //also act as break
               
            }
            
        }
    }