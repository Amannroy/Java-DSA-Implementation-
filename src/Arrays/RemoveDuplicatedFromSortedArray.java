package Arrays;

public class RemoveDuplicatedFromSortedArray {
     public static int removeDuplicates(int[] arr) {
         int uniqueIndex = 0;

         for(int i=1;i<arr.length;i++){
             if(arr[i] != arr[uniqueIndex]){
                 uniqueIndex++;
                 arr[uniqueIndex] = arr[i];
             }

     }
         return uniqueIndex+1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4};
        int newLength = removeDuplicates(arr);
        System.out.println("New Length:" + newLength);
    }
}
