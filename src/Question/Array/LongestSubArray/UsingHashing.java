package Question.Array.LongestSubArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UsingHashing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int []arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        System.out.println("Enter the sum: ");
        int k= scanner.nextInt();

        Map<Integer,Integer>preSum=new HashMap<>();

         int maxLength=0;

         int sum=0;

         for(int i=0;i<n;i++){
             sum=sum+arr[i];

             if(sum==k){
                 maxLength=Math.max(maxLength,i+1);
             }

             int rem=k-sum;
             if(preSum.containsKey(rem)){
                 maxLength=Math.max(maxLength,i-preSum.get(rem)+1);
             }

             if(!preSum.containsKey(sum)){
                 preSum.put(sum,i);
             }
         }

        System.out.println("Maximum length: "+maxLength);
    }
}
