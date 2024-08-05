import Medium.*;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] k={0,0,1,1,1,2,2,3,3,4};
        int[] nums= new RemoveDuplicate().removeDuplicates(k);
        System.out.println(Arrays.toString(Arrays.stream(nums).toArray()));
    }
}