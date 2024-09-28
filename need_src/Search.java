public class Search {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Return -1 if the element is not found
    }

    static int binarySearch(int[] num, int tar){
        int left=0;
        int right=num.length-1;

        while(left<=right)
        {int mid=(left+right)/2;
        if(num[mid]==tar){
            return mid;
        }                   
        else if(num[mid]<tar){
            left=mid+1;
        }
        else{
            right=mid-1;
        }}

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12};
        int target = 2;
        int index1 = linearSearch(numbers, target);
        int index2 = binarySearch(numbers, target);

        if (index1 != -1) {
            System.out.println("Element found at index: " + index1);
        } else {
            System.out.println("Element not found in the array lin");
        }

        if (index2 != -1) {
            System.out.println("Element found at index: " + index2);
        } else {
            System.out.println("Element not found in the array bin");
        }
    }
}