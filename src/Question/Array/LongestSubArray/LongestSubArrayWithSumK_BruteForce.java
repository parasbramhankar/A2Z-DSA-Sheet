package Question.Array.LongestSubArray;

import java.util.Scanner;

public class LongestSubArrayWithSumK_BruteForce {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("Enter the sum: ");
        int k= scanner.nextInt();

        int maxLength=0;

        for(int i=0;i<n;i++){

         int sum=0;

         for(int j=i;j<n;j++){

             sum+=arr[j];

             if(sum==k){
                maxLength=Math.max(maxLength,j-i+1);
             }
         }
        }
        System.out.println("MaxLength: "+maxLength);
    }
}
