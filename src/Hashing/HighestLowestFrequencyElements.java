package Hashing;

import java.util.*;

public class HighestLowestFrequencyElements {
    static ArrayList<Integer> count(int[]arr){

        ArrayList<Integer>arrayList=new ArrayList<>();
        int max= Arrays.stream(arr).max().getAsInt();

        int   hash[]=new int[max+1];
        //precompute
        for(int i=0;i<arr.length;i++){
            hash[arr[i]]++;
        }

        int minEle=0;
        int minFre=Integer.MAX_VALUE;

        int maxEle=0;
        int maxFre=Integer.MIN_VALUE;

        for(int i=0;i<hash.length;i++){
            if(minFre>hash[i] && hash[i]!=0){
                minFre=hash[i];;
                minEle=i;
            }

            if(maxFre<hash[i]){
                maxFre=hash[i];
                maxEle=i;
            }
        }

        arrayList.add(minEle);
        arrayList.add(maxEle);

        return arrayList;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();

        int []arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }
        ArrayList<Integer>arrayList=count(arr);

        System.out.println(arrayList);
    }
}
