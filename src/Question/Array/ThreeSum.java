package Question.Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ThreeSum {

    static List<List<Integer>> function(int[]arr){

        int n=arr.length;
        Arrays.sort(arr);
        List<List<Integer>>triplets=new ArrayList<>();


        for(int i=0;i<n;i++){

            int j=i+1,k=n-1;

            if(i>0 && arr[i-1]==arr[i]){
                continue;
            }

            while (j<k){
               int sum=arr[i]+arr[j]+arr[k];

               if(sum>0){
                   k--;
               }
               else if(sum<0){
                   j++;
               }
               else {
                   triplets.add(Arrays.asList(arr[i], arr[j], arr[k]));
                   j++;
                   k--;

                   while (j < k && arr[j] == arr[j - 1]) {
                       j++;
                   }
               }
            }
          }
        return triplets;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();

        int[]arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        List<List<Integer>>arrList=function(arr);

        System.out.println(arrList);
    }

}
