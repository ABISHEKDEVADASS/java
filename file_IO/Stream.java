import java.util.Arrays;
import java.util.List;
import java.util.stream.*;
import java.util.*;



/*
//filter()_stream 
public class Stream {
public static void main(String args[]){
    //creat list1
    List<Integer> list1=Arrays.asList(1,2,3,4,5);
    System.out.println(list1);
    List<Integer> list2=list1.stream().         filter(n->n%2==0).                  collect(Collectors.toList());
//create list2-------    connect with list1     apply conditiion for list1 element      store it in list2
    System.out.println(list2);
}
}


//-------5types of stream->object stream,int Stream,Long Stream,Double Stream,parrallel Stream



public class Stream {
public static void main(String args[]){
    //objectStream-->used to captilalise
    List<String> list1=Arrays.asList("one","two");
    List<String> list2=list1.stream().map(String::toUpperCase).collect(Collectors.toList());
    System.out.println(list2);


    //IntStream-->Used to add range of numbers
    IntStream add=IntStream.range(1, 10);
    int add1=add.sum();
    System.out.println(add1); //o/p--->1+2+3....+10


    //LongStream-->used to multiply range of numbers
    LongStream mult=LongStream.rangeClosed(1,2);
    long mult1=mult.reduce(2,(a,b)->a*b); //2 is a
    System.out.println(mult1);

    //DoubleStream-->used to find avng num of list
    DoubleStream avg=DoubleStream.of(1,3,2);
    double avg1=avg.average().orElse(0);
    System.out.println(avg1);

    //ParrallelStream--->parralling element
    List<String> p=Arrays.asList("one","b","two","c");
    p.parallelStream().forEach(System.out::println);

}


}

*/
class Stream{
    public static void main(String[] args) {
        //multiple only add numbers with *2

        List<Integer> list1 = Arrays.asList(5,2,4,7,8);
        

    
        List list2 = list1.stream()
        .filter(n->n%2==1)
        .map(n->n*2)
        .sorted()
        .map(n->n/2)
        .collect(Collectors.toList());
     
        System.out.println(list2);
                                             

       
        
    }
}


    
