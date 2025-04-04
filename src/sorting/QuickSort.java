package sorting;

import java.util.Scanner;

public class QuickSort {

    static int partition(int []arr, int low,int high){
        int pivate=arr[low];
        int i=low;
        int j=high;

        while(i<j){
            while(arr[i]<=pivate && i<high){
                i++;
            }

            while(arr[j]>pivate && j>low){
                j--;
            }

            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;

        return j;
    }
    static void quickSort(int []arr,int low,int high){

        if(low<high){

            int parIndex=partition(arr,low,high);
            quickSort(arr, low, parIndex-1);
            quickSort(arr,parIndex+1,high);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int []arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        quickSort(arr,0,n-1);

        for(int ele:arr){
            System.out.print(ele+" ");
        }


    }
}
