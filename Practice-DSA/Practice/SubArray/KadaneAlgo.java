import java.util.*;

class KadaneAlgo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of SubArray");
        int n = sc.nextInt();

        int arrayInput[] = new int[n];

        System.out.println("Enter " + n + " inputs");
        for (int i = 0; i < n; i++) {
            arrayInput[i] = sc.nextInt();
        }

        //Find the maximum sum of any contiguous subarray.
        System.out.println("MaxSum is : " + maxSum(arrayInput));
        System.out.println("MaxSum is(KadaneLogic) : " + kadaneAlgo(arrayInput));

    }

    public static int kadaneAlgo(int[] arrayInput) {
        int n = arrayInput.length;
        int sum = 0;
        int finalSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += arrayInput[i];
            if (sum > finalSum) finalSum = sum;
            if (sum < 0) sum = 0;
        }
        return finalSum;
    }

    public static int maxSum(int[] arrayInput) {
        int n = arrayInput.length;
        int sum = 0;
        int finalSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = i; j < n; j++) {
                sum += arrayInput[j];
                if (sum > finalSum) {
                    finalSum = sum;
                }
            }
        }
        return finalSum;
    }
}