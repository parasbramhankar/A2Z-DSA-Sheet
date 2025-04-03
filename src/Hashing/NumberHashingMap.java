package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberHashingMap {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int []arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Map<Integer,Integer> map=new HashMap<>();

        //Precompute
        for(int i=0;i<n;i++){

            int key=arr[i];
            int fre=0;
            if(map.containsKey(key)){
                fre=map.get(key);
            }
            fre++;

            map.put(key,fre);
        }

        System.out.println("Enter the number of test cases : ");
        int t=sc.nextInt();

        while(t>0){
            int num=sc.nextInt();
            System.out.println(num+": "+map.get(num));
            t--;
        }

        sc.close();
    }
}
