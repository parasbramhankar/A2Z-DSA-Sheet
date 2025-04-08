package Question.Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSubsequence {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();

        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int count=0;
        int maxCount=0;

        for(int i=0;i<arr.length-1;i++){

            if(arr[i]==(arr[i+1]-1))
            {
                count++;
            }
            else{
                maxCount=Math.max(count,maxCount);
                count=0;
            }
        }
        if(count>maxCount){
            maxCount=count;
        }
        maxCount++;

        System.out.println(maxCount);

    }
}
