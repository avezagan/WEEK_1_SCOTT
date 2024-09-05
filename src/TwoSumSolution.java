import java.util.HashMap;

public class TwoSumSolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSumSolution solution = new TwoSumSolution();

        int[] nums1 = {2, 7, 11, 15};
        int[] result1 = solution.twoSum(nums1, 9);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {1, 2, 3, 4, 5, 6};
        int[] result2 = solution.twoSum(nums2, 7);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {1000000000, 299999999, 700000001};
        int[] result3 = solution.twoSum(nums3, 1000000000);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");

        int[] nums4 = {-10, -5, -3, -4, -2};
        int[] result4 = solution.twoSum(nums4, -7);
        System.out.println("[" + result4[0] + ", " + result4[1] + "]");
    }
}