package sorting;

import java.util.Scanner;



public class BubbleSort {

    public static void bubbleSort(int[]arr){
        int n= arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int []arr=new int[n];

        for(int i=0;i<n;i++){
         arr[i]=scanner.nextInt();
        }

        bubbleSort(arr);

        for(int ele:arr){
            System.out.print(ele+" ");
        }


    }
}
