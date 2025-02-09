package Recursion;

public class CountDown {
    private static void count(int i){
        //System.out.println(i);

        // Base Case
        if(i == 0){
            return;
        }else{
            count(i-1);
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        count(5);
    }
}
