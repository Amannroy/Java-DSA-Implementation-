package Arrays;

public class MissingNumber {

    public static int findMissing(int[] arr, int n) {
        int total_sum = n * (n + 1) / 2; // Sum of first n numbers
        int arraySum = 0;

        for(int num: arr){
            arraySum += num;
        }

        return total_sum - arraySum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
        int n = 6;
        System.out.println("Missing Number: " + findMissing(arr, n));
    }
}
