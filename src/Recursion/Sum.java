package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum {
    public static int sum(ArrayList<Integer> num_list, int index){
        // Base Case
        if(num_list.size() == index){
            return 0;
        }else{
            int num = num_list.get(index);
            return num + sum(num_list, index+1);
        }
    }

    public static void main(String[] args) {
        int total = sum(new ArrayList<Integer>(Arrays.asList(2,4,6)), 0);
        System.out.println(total);
    }
}
