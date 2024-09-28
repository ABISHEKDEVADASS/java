class one{
    <T> void call(T b){
        T a=b;
        System.out.println("printed "+a);
    }
}
class generic_class{
    public static void main(String args[]){
        one ob=new one();
        ob.call(3);
        ob.call("three");
    }
}