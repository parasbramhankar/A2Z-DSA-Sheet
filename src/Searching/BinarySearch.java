package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {


    static int binarySearch(int[] arr, int low,int high,int ele){

        while(low<high){

            int mid=low+(high-low)/2;

            if(arr[mid]==ele){
                return mid;
            }

            if(arr[mid]>ele){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Enter the Element: ");
        int ele = scanner.nextInt();

        int index = binarySearch(arr, 0,arr.length-1,ele);

        System.out.println("Index: " + index + " ||Position: " + (index + 1));
    }
}
