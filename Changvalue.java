import java.lang.reflect.Array;
import java.util.Arrays;

public class Changvalue {
    public static void main(String[] args) {
        //create an array 

        int[] a = {1,2,3,4};
        change(a);
        System.out.println(Arrays.toString(a));
    }

    static void change(int[] nums){
        nums[0] = 88;
    }
}
