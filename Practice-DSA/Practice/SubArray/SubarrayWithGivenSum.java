import java.util.Arrays;

public class SubarrayWithGivenSum {

    public static int[] subarrayWithGivenSum(int[] nums, int k) {
        //Write Your Code Here
        int sum=0;
        int initialPos=0;
        for(int i=0;i<nums.length;i++){
            sum=0;
            initialPos=i;
            for(int j=i;j< nums.length;j++){
                sum+=nums[j];
                if(sum==k){
                    return new int[]{initialPos,j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static void checkSolution() {
        assert Arrays.equals(subarrayWithGivenSum(new int[]{1, 2, 3, 4, 5}, 9), new int[]{2, 4}) : "Test case 1 failed";
        assert Arrays.equals(subarrayWithGivenSum(new int[]{1, 2, 3, 7, 5}, 12), new int[]{3, 4}) : "Test case 2 failed";
        assert Arrays.equals(subarrayWithGivenSum(new int[]{1, 2, 3, 4, 5}, 15), new int[]{0, 4}) : "Test case 3 failed";
        assert Arrays.equals(subarrayWithGivenSum(new int[]{1, 2, 3, 4, 5}, 1), new int[]{0, 0}) : "Test case 4 failed";
        assert Arrays.equals(subarrayWithGivenSum(new int[]{1, 2, 3, 4, 5}, 100), new int[]{-1, -1}) : "Test case 5 failed";
        System.out.println("All test cases passed!");
    }

    public static void main(String[] args) {
        checkSolution();
    }
}