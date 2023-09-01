package Java;

import java.util.*;

public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                int result[] = {hashMap.get(target - nums[i]), i};
                return result;
            }
            hashMap.put(nums[i], i);
        }

        return null;
    }
}
