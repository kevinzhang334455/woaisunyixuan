import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                result[0] = hashMap.get(nums[i]);
                result[1] = i;
                return result;
            } else {
                hashMap.put(target - nums[i], i);
            }
        }

        throw new IllegalArgumentException("Solution should have an answer!");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] test = {2,7,11,15};
        int[] result = solution.twoSum(test, 9);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
