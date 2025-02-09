package List;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<int[]> merged = new ArrayList<>();
        merged.add(new int[] {1,2,3});
        merged.add(new int[] {4,5,6});
        int[] firstArray = merged.get(0);

        for(int num: firstArray) {
            System.out.println(num);
        }
    }
}
