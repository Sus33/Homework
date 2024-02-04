package twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
//        int target = 1; throw exception when target = 1;

        TwoSum sum = new TwoSum();
        int[] result = sum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }

    public int[] twoSum(int[] nums, int target) {
        Map map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int fill = target - nums[i];
            if (map.containsKey(fill)) {
                return new int[]{(int) map.get(fill), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Not two sum here!!");
    }
}