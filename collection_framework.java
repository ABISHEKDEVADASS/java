
import java.util.*;

//collection_framework(5types)-List,Queue,Set,Map,iterator
//list--->ArrayList,LinkedList,vector
//Queue----> queue integrated with linkedList
//set-----.Hashset,LinkedHashet,treehashset
//iterator-->single type
//map--->Hashmap,LinkedHashmap,tree hashmap
/*	-----list----------


//simple list
import java.io.*;
import java.util.*;
public class Stream {
public static void main(String args[]){
    List<Integer> list=Arrays.asList(1,2,3,4,5);
    System.out.println(list);
}
}




 
public class collection_framework {
//array
	public static void main(String[] args) {
		int a[]=new int[10];
		
		for(int i=1;i<=9;i=i+1) {
			a[i-1]=i;
		}
		
		// Print the array
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
   
		
	}

}
////LIST(3 TYPES)-1)ARRAYLIST,2)LINKEDLIST,3)VECTOR

//araylist
//here problem is,if we remove any element in center of array,we want to shift every element to fill empty place,but this issues not in linkedlist
public class collection_framework {
	
		public static void main(String[] args) {
	   
		ArrayList a_list = new ArrayList();
		for(int i=1;i<=10;i=i+1) {
			a_list.add(i);	
		}
		//array list accept repeated values
		a_list.add(11);	
		a_list.add(11);	
		a_list.add(11);	
		a_list.add(11);		//add element last of array
`		
		
		//we can insert any type
		a_list.add('A');//char
		a_list.add("string");	
		
		
		a_list.remove(3); //we can remove element by mentioning index
		a_list.set(0,"frst element");	//update exixting 
		System.out.println(a_list.get(0));//call particular element in array by using index
		System.out.println(a_list.contains('A'));	//this contain fn check,mention data is present in array or not
		
						
		System.out.println(a_list);
		
		//mention specific type in arraylist
		ArrayList<Integer> arr_list=new ArrayList<Integer>();
		//only integer will accept
		arr_list.add(1);
		arr_list.add(2);
		arr_list.add(3);
		System.out.println(arr_list);
		
		
		
		ArrayList<String> ar_list=new ArrayList<String>();
		//only String will accept
		ar_list.add("s1");
		ar_list.add("s2");
		ar_list.add("s3");
		System.out.print(ar_list);
		}
	}
	




//Linked_list
//linkedlist is most preferable,bcz evry element has pointer,we can easly change index position even center element removed
class collection_framework
{
	public static void main(String args[]) {
		LinkedList l_L=new LinkedList();
		l_L.add(100);
		l_L.add(100);
		System.out.println(l_L);
	}
}
  

//vector
//rarely used,not that much good
class collection_framework
{
	public static void main(String args[]) {
		Vector l_L=new Vector();
		l_L.add(100);
		
		System.out.println(l_L);
	}
}









 ---------queue--------
//queue mans FIFO-frst come first out(if we remove element in array,frst element only remove)


class collection_framework
{
	public static void main(String args[]) {
		Queue q=new LinkedList();
//Syntax for Queue:Queue variable_name=new LinkedList
		q.add(10);
		q.add(9);
		q.add(8);
		System.out.println(q);
	}
}

class collection_framework
{
	public static void main(String args[]) {
		Queue<Integer> q=new LinkedList<>();
//Syntax for Queue:Queue<mention_datatype> variable_name=new LinkedList<>();
		q.add(5);
		q.add(2);
		q.remove();	//or q.poll();
		System.out.println(q);
		
	}
}

class collection_framework
{
	public static void main(String args[]) {
		Queue<Integer> q=new LinkedList<>();
//Syntax for Queue:Queue<mention_datatype> variable_name=new LinkedList<>();
		q.add(5);
		q.add(2);
		//printing the frst element of queue
		System.out.println("frst element of array "+q.peek());
	}
}






//---------set--------------


//unique elements only add,no repeated elements

class collection_framework{
	public static void main(String args[]) {
		
		HashSet<String> h=new HashSet<>();
		//unorderly save
		h.add("abi");
		h.add("cat");
		h.add("boll");
		h.add("dall");
		System.out.println(h);
	}
}





class collection_framework{
	public static void main(String args[]) {
		
		TreeSet<String> h=new TreeSet<>();
		//shortedly save
		h.add("abi");
		h.add("cat");
		h.add("boll");
		h.add("dall");
		System.out.println(h);
	}
}

//	-----iterator----
class collection_framework{
	public static void main(String args[]) {
		ArrayList<String> a=new ArrayList<>();
		a.add("one");
		a.add("two");

		Iterator I=a.iterator();
		//System.out.println(I.next());//this is used to print frst element of array
		//System.out.println(I.next());//this is used to print next  element of above element inarray
		//secure printing then ordinary printing
		while(I.hasNext()) {
			System.out.println(I.next());
		}
		
	}
}


//	------Map-----
class collection_framework{
	public static void main(String args[]) {
		Map<String,Integer> quantity=new HashMap();
		quantity.put("Apple", 20);
		quantity.put("Orange", 30);
		quantity.put("Apple1", 40);
		quantity.put("Orange1", 50);
		quantity.put("Apple2", 60);
		quantity.put("Orange2", 70);
		quantity.put("Apple3", 80);
		quantity.put("Orange3", 90);
		System.out.println(quantity);
		System.out.println(quantity.keySet());
		System.out.println(quantity.values());
		System.out.println(quantity.get("Apple"));
	}
}

//remove
class collection_framework{
	public static void main(String args[]) {
		Map<String,Integer> quantity=new HashMap();
		quantity.put("Apple", 20);
		quantity.put("Orange", 30);
		quantity.put("Apple1", 40);
		quantity.put("Orange1", 50);
		//remove
		quantity.remove("Apple");
		System.out.println(quantity);
		//update
		int a=quantity.get("Orange")+10;
		quantity.put("Orange", a);
		System.out.println(quantity);
		
		//check if we our needed fruit is present or not
		System.out.println(quantity.containsKey("Orange"));
		System.out.println(quantity.containsKey("Orange1"));
		System.out.println(quantity.containsKey("Graphs"));
		
	}
}

//Linked hasmap
//print in same order
class collection_framework{
	public static void main(String args[]) {
		Map<String,Integer> quantity=new LinkedHashMap();
		quantity.put("Apple", 20);
		quantity.put("Orange", 30);
		quantity.put("Apple1", 40);
		System.out.println(quantity);
	}
}


//treeMap
//in sorted order
class collection_framework{
	public static void main(String args[]) {
		Map<String,Integer> quantity=new TreeMap();
		quantity.put("Apple", 20);
		quantity.put("Orange", 30);
		quantity.put("Apple1", 40);
		System.out.println(quantity);
	}
}
*/