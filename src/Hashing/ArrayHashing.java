package Hashing;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayHashing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter "+n+" Array Elements: ");
        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        //precompute

        int max= Arrays.stream(arr).max().getAsInt();

        int[]HashArray=new int[max+1];

        for(int i=0;i<n;i++){
            HashArray[arr[i]]++;
        }

        //fetch

        System.out.println("Number of queries: ");
        int q= scanner.nextInt();

        while(q>0){
            System.out.println("Enter the number: ");
            int ele= scanner.nextInt();
            System.out.println("The frequency " +HashArray[ele]);
            q--;
        }

        scanner.close();


    }
}
