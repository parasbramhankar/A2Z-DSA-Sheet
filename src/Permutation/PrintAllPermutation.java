package Permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class PrintAllPermutation {

    public static void findPermutation(int[]arr,List<List<Integer>>ans,List<Integer>ds,boolean[]check){

        if(ds.size()== arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<arr.length;i++){

            if(!check[i]){

                ds.add(arr[i]);
                check[i]=true;

                findPermutation(arr,ans,ds,check);

                ds.removeLast();
                check[i]=false;

            }

        }

    }

    static List<List<Integer>> permutation(int[]arr){
       List<List<Integer>>ans=new ArrayList<>();

       List<Integer>ds=new ArrayList<>();

        boolean[]check=new boolean[arr.length];
        Arrays.fill(check,false);

        findPermutation(arr,ans, ds,check);

        return ans;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();

        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        List<List<Integer>>ans=permutation(arr);

        System.out.println(ans);

    }
}
