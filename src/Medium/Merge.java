package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0, i=m;j<n;j++){
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}
