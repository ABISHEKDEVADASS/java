//bubble sorting
/* 
public class sort {
public static void main(String[] args) {
    int temp=0;
    int[] arr={9,8,7,6,5,4,3,2,1};
   System.out.println("before sorting");
    for(int array:arr){
        System.out.print(array+" ");
    }

    System.out.println("after sorting");
    for(int j=0;j<arr.length-1;j++)
    {
        for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            temp=arr[i];        //next 3 three line are swaping method
            arr[i]=arr[i+1];
        arr[i+1]=temp;
    }
}
    
    
    }
    for(int array1:arr){
        
        System.out.print(array1+" ");
    }
    
}
}

//selection sorting
class sort {
    public static void selectionSort(int[] array) {
        int n = array.length;

        // Traverse through all array elements
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        selectionSort(array);
        System.out.println("Sorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}


//insertion sorting
class sort {
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6};

        // Perform insertion sort
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }

        // Print sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
*/
class sort{
    public static void main(String[] args) {
        int[] a={5,3,6,1,4,2};
        

    }}