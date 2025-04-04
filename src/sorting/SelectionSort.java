package sorting;

import java.util.Scanner;

public class SelectionSort {

    static void selectionSort(int []arr){

        int n=arr.length;
        for(int i=0;i<n-1;i++){

            int min=i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int []arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        selectionSort(arr);

        for(int ele:arr){
            System.out.print(ele+" ");
        }


    }
}
