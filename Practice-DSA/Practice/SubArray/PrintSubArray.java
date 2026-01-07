import java.util.*;
class PrintSubArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size Of SubArray");
        int n=sc.nextInt();

        int arrayInput[]=new int[n];

        System.out.println("Enter "+ n +" inputs");
        for(int i=0;i<n;i++){
            arrayInput[i]=sc.nextInt();
        }

        printSubArray(arrayInput,arrayInput.length);
        System.out.println();
        printSubArrayUsingSB(arrayInput,arrayInput.length);
        sc.close();
    }
    public static void printSubArray(int[] arrayInput,int n){
        System.out.println("SubArrays Using n^3 Without Extra Spaces");
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("[");
                for(int k=i;k<=j;k++){
                    if(k<j){
                        System.out.print(arrayInput[k]+",");
                        continue;
                    }
                    System.out.print(arrayInput[k]);
                }
                if(i==n-1 && j==n-1){
                    System.out.print("]");
                    break;
                }
                System.out.print("] ");
            }
        }
    }
    public static void printSubArrayUsingSB(int[] arrayInput,int n){
        System.out.println("SubArrays Using n^2 With StringBuilder");
        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.setLength(0);
            sb.append("[");
            for (int j = i; j < n; j++) {
                if(j>i){
                    sb.append(",");
                }
                sb.append(arrayInput[j]);
                System.out.print(sb);
                System.out.print("] ");
            }
        }

    }
}