import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> resultList = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                if (resultList.isEmpty() || resultList.get(resultList.size() - 1) != nums1[i]) {
                    resultList.add(nums1[i]);
                }
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] result = new int[resultList.size()];
        for (int k = 0; k < resultList.size(); k++) {
            result[k] = resultList.get(k);
        }

        return result;
    }
}
