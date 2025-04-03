package Hashing;

import java.util.Scanner;
import java.util.*;

public class NumberHashingArray {

    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();

        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        //Precompute

        int max=Arrays.stream(arr).max().getAsInt();

        int hash[]=new int[max+1];

        Arrays.fill(hash,0);

        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }

        System.out.println("number of test cases: ");
        int t=sc.nextInt();

        //fetching
        while(t>0){
            int num=sc.nextInt();
            System.out.println(num+": "+hash[num]);
            t--;
        }

        sc.close();
    }
}
