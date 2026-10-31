import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            // we skip all numbers that we already used in position 1 of results treplits
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int a = nums[i];

            if (a > 0) {
                break;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = a + nums[left] + nums[right];

                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    result.add(List.of(a, nums[left], nums[right]));
                    left++;
                    right--;

                    // we skip all numbers that we already used in position 2 of results treplits
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                }
            }

        }
        return result;
    }
}
