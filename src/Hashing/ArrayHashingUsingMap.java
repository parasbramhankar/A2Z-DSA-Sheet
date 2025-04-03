package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayHashingUsingMap {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int[]arr=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]= scanner.nextInt();
        }

        Map<Integer,Integer>hashMap=new HashMap<>();

        //precompute
        for(int i=0;i<n;i++){
            int fre=hashMap.getOrDefault(arr[i],0);  // important line
            fre++;
            hashMap.put(arr[i],fre);
        }

        //fetch
        System.out.println("Enter the number");
        int ele= scanner.nextInt();

        System.out.println("The Frequency of the "+hashMap.get(ele));
        scanner.close();
    }
}
