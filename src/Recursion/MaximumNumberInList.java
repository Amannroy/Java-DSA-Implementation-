package Recursion;

import java.util.ArrayList;

public class MaximumNumberInList {
    public static int findMax(int[] arr, int index, int maxSoFar){
        // Base Case: If we reach the end of the array, return max found so far
        if(index == arr.length){
            return maxSoFar;
        }
        // Update maxSoFar if the current element is greater
        if(arr[index] > maxSoFar){
            maxSoFar = arr[index];
        }

        // Recursive call with the next index
        return findMax(arr, index+1, maxSoFar);
    }

    public static void main(String[] args) {
        int[] numbers = {10,25,50,15,30};
        int maxNumber = findMax(numbers, 0, numbers[0]);
        System.out.println("Maximum number in the array: " + maxNumber);

    }
}
