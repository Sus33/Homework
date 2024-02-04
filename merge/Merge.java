package merge;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Merge {
    static void mergeArrays(int[] nums1, int[] nums2, int n, int m) {
        Map<Integer, Boolean> map = new TreeMap<>();
        int i = nums1[0];
        if (0 <= m && n <= 200 && 1 <= m + n && m + n <= 200) {
            while (i < nums1.length) {
                map.put(nums1[i], true);
                for (int num : nums2) {
                    nums1[m] = num;
                    m++;
                }
                break;
            }
            Arrays.sort(nums1);
            System.out.println(Arrays.toString(nums1));
        }
    }

    public static void main(String[] args) {
        int[] m = {1, 2, 3, 0, 0, 0};  //1 2 2 3 5 6
        int[] n = {2, 5, 6};
        int size = m.length;
        int size1 = n.length;
        mergeArrays(m, n, size, size1);
    }
}

