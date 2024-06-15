import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public TwoSum() {
        
    }
    public int[] findPair(int target, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};  // Return an array indicating no pair found
    }
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 11, 15, 7};
        int target = 9;
        int[] result = twoSum.findPair(target, nums);
        System.out.println("Indices of two numbers that add up to " + target + " are " + result[0] +" and "+result[1]);
    }
}
