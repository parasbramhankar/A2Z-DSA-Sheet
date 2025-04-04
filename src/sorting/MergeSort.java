package sorting;

import java.util.Scanner;

public class MergeSort {

    static void merge(int []arr,int low,int mid,int high){


        int left=low;
        int right=mid+1;

        int []temp=new int[arr.length];
        int count=low;

        while(left<=mid && right<=high){

            if(arr[left]<=arr[right]){
                temp[count]=arr[left];
                count++;
                left++;;
            }
            else{
                temp[count]=arr[right];
                right++;
                count++;
            }
        }

        while(right<=high){
            temp[count]=arr[right];
            right++;
            count++;
        }

        while(left<=mid){
            temp[count]=arr[left];
            left++;
            count++;
        }


        for(int i=low;i<high;i++){
            arr[i]=temp[i];
        }
    }

    public static void mergeSort(int []arr,int low,int high){

        if(low>=high){
            return;
        }

        int mid=(low+high)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);

        merge(arr,low,mid,high);
    }
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();

        int []arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        mergeSort(arr,0,n);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
