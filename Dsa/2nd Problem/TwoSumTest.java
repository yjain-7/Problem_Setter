import java.util.Arrays;
public class TwoSumTest {

    public static void main(String[] args) {
        testFindPair(new int[]{9, 7, 2, 5, 3, 1}, 10, new int[]{1, 4});
        testFindPair(new int[]{8, 7, 2, 5, 3, 1}, 14, new int[]{-1, -1});
        testFindPair(new int[]{5, 5, 2, 3}, 10, new int[]{0, 1});
        testFindPair(new int[]{1, 2, 3, 4, 5}, 9, new int[]{3, 4});
        testFindPair(new int[]{1, 2, 3, 4, 5}, 10, new int[]{-1, -1});
        testFindPair(new int[]{}, 5, new int[]{-1, -1}); // Test with empty array
    }

    private static void testFindPair(int[] nums, int target, int[] expected) {
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.findPair(target, nums);

        if (result[0] == expected[0] && result[1] == expected[1]) {
            System.out.printf("Test passed for nums=%s, target=%d. Expected: %s, Actual: %s\n",
                    Arrays.toString(nums), target, Arrays.toString(expected), Arrays.toString(result));
        } else {
            System.out.printf("Test failed for nums=%s, target=%d. Expected: %s, Actual: %s\n",
                    Arrays.toString(nums), target, Arrays.toString(expected), Arrays.toString(result));
        }
    }
}
