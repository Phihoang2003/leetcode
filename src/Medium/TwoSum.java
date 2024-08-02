package Medium;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {

    public List<Integer> twoSum(int[] nums,int target){
        List<Integer> results = new ArrayList<>();
        boolean[] used = new boolean[nums.length]; // Mảng để đánh dấu các phần tử đã được sử dụng

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; // Bỏ qua phần tử đã được sử dụng
            for (int j = i + 1; j < nums.length; j++) {
                if (used[j]) continue; // Bỏ qua phần tử đã được sử dụng
                if (nums[i] + nums[j] == target) {
                    results.add(i);
                    results.add(j);
                    used[i] = true;
                    used[j] = true;
                    break; // Tìm thấy một cặp thì thoát vòng lặp bên trong
                }
            }
        }

        return results; // Trả về danh sách các chỉ số
    }

}
