package Recursion;

public class BinarySearch {

    public static int binarySearch(int[] arr, int low, int high, int target){

        // Base Case: If low index crosses high, target is no in the array
        if(low > high){
            return -1;
        }

        // Find the middle index
        int mid = low + (high - low) / 2;

        // if element is found at mid
        if(arr[mid] == target){
            return mid;
        }

        // if target is smaller, search in the left half
        if(arr[mid] > target){
            return binarySearch(arr, low, mid-1, target);
        }

        // if target is larger, search in the right half
        return binarySearch(arr, mid+1, high, target);
    }

    public static void main(String[] args) {
        int[] sortedArray = {2,4,6,8,10,12,14};
        int target = 14;

        int index = binarySearch(sortedArray, 0, 6, target);

        if(index != -1){
            System.out.println("Element found at index " + index);
        }else{
            System.out.println("Element not found in array.");
        }
    }
}
