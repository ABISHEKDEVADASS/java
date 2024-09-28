/*// Define a generic class
class Box<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

// Use the generic class
public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello");
        System.out.println(stringBox.getContent()); // Output: Hello

        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(123);
        System.out.println(integerBox.getContent()); // Output: 123
    }
}

//2
public class Main {
    // Define a generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();b 
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B", "C"};

        // Use the generic method
        printArray(intArray); // Output: 1 2 3 4 5 
        printArray(stringArray); // Output: A B C 
    }
}


//3
// Define a generic method with bounded type parameter
public class Main {
    public static <T extends Number> void printSum(T num1, T num2) {
        System.out.println(num1.doubleValue() + num2.doubleValue());
    }

    public static void main(String[] args) {
        printSum(10, 20); // Output: 30.0
        printSum(15.5, 20.5); // Output: 36.0
        
        // The following line will cause a compile-time error because String is not a subclass of Number
        // printSum("10", "20");
    }
}
*/

//4
// Define a generic interface
interface Pair {
    public getKey();
    public getValue();
}

// Implement the generic interface
class OrderedPair implements Pair {
    private key;
    private  value;

    public OrderedPair(key,  value) {
        this.key = key;
        this.value = value;
    }

    public  getKey() { return key; }
    public  getValue() { return value; }
}

class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new OrderedPair<>("One", 1);
        System.out.println(pair.getKey() + " = " + pair.getValue()); // Output: One = 1
    }
}
