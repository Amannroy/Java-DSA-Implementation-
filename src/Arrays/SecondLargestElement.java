package Arrays;

public class SecondLargestElement {
    public static int findSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num: arr){
            if(num > largest){
                second = largest;
                largest = num;
            }else if(second < num && num != largest){
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 8, 30};
        System.out.println("Second Largest: " + findSecondLargest(arr));
    }
}
