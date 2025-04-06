package Question.Array.LongestSubArray;

import java.util.Scanner;

public class LongestSubArrayWithGivenSumPositive {

    static int checkLength(int[]arr,int sum){

        int left=0;
        int right=0;

        int arraySum=arr[0];

        int n=arr.length;
        int maxLength=0;

        while (right < n) {

            while (left <= right && arraySum> sum) {
                arraySum -= arr[left];
                left++;
            }

            if (arraySum == sum) {
                maxLength = Math.max(maxLength, right - left + 1);
            }

            right++;
            if (right < n) arraySum += arr[right];
        }

        return maxLength;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();

        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        System.out.println("Enter the sum: ");
        int sum= scanner.nextInt();

        System.out.println(checkLength(arr,sum));
    }
}
