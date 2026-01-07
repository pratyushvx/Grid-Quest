import java.util.*;
class CountSubArray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of SubArray");
        int n=sc.nextInt();

        int arrayInput[]=new int[n];

        System.out.println("Enter "+ n +" inputs");
        for(int i=0;i<n;i++){
            arrayInput[i]=sc.nextInt();
        }

        int count=countSubArrayUsingFormula(arrayInput,arrayInput.length);
        System.out.println("Count is "+ count);
        System.out.println();
        int count1=countSubArray(arrayInput,arrayInput.length);
        System.out.println("Count is "+ count1);
    }
    public static int countSubArray(int[] arrayInput,int n){

        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                count++;
            }
        }
        return count;
    }
    public static int countSubArrayUsingFormula(int[] arrayInput,int n){

        // We have To Count No Of SubArray In N Array
        return (n*(n+1))/2;
    }
}