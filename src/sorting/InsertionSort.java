package sorting;

import java.util.Scanner;

public class InsertionSort {

    static void insertionSort(int []arr){

        int n=arr.length;

        for(int i=1;i<n-1;i++){

            int index=i-1;
            int ele=arr[i];

            while(index>=0 && arr[index]>ele){
                arr[index+1]=arr[index];
                index--;
            }
            arr[index+1]=ele;
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int []arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }

        insertionSort(arr);

        for(int ele:arr){
            System.out.print(ele+" ");
        }


    }
}
