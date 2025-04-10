package Question.Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();

        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        System.out.println("MaximumNumber: "+ Arrays.stream(arr).max().getAsInt());
    }
}
