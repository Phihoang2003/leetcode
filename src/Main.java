import Medium.Merge;
import Medium.Palindrom;
import Medium.RemoveElement;
import Medium.TwoSum;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] nums = {0,1,2,2,3,0,4,2}; int val = 2;
        List<Integer> k=new RemoveElement().removeElement(nums,val);
        System.out.println(k);
    }
}