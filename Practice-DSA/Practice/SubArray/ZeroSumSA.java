import java.util.HashSet;
import java.util.Set;

public class ZeroSumSA {

    // ✅ LeetCode Style Solution Function
    // Time Complexity: O(N) | Space Complexity: O(N)
    public static boolean hasZeroSumSubarray(int[] nums) {
        int sum=0,n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==0){
                    return true;
                }
            }
        }
        return false;
    }

    // ✅ Main method with Test Cases
    public static void main(String[] args) {
        // Test Case 1: Standard case (Subarray: [2, -3, 1])
        int[] arr1 = {4, 2, -3, 1, 6};
        runTest(arr1, "Test Case 1");

        // Test Case 2: Array containing 0
        int[] arr2 = {4, 2, 0, 1, 6};
        runTest(arr2, "Test Case 2");

        // Test Case 3: Subarray starting from index 0 sums to 0
        int[] arr3 = {-3, 2, 1, 6};
        runTest(arr3, "Test Case 3");

        // Test Case 4: No zero sum subarray
        int[] arr4 = {1, 2, 3, 4};
        runTest(arr4, "Test Case 4");
    }

    // Helper function to print results nicely
    public static void runTest(int[] arr, String testName) {
        boolean result = hasZeroSumSubarray(arr);
        System.out.println(testName + " Input: " + java.util.Arrays.toString(arr));
        System.out.println("Result: " + result); // Expected: true/false
        System.out.println("-------------------------");
    }
}