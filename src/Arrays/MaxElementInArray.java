package Arrays;

public class MaxElementInArray {

    public static void main(String[] args) {
        int[] arr = {10, 25, 98, 45, 63};

        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
    }
}
