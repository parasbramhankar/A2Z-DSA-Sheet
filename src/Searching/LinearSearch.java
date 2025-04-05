package Searching;

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int []arr, int ele){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                index=i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();

        int []arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]= scanner.nextInt();
        }

        System.out.println("Enter the Element: ");
        int ele= scanner.nextInt();

        int index=linearSearch(arr,ele);

        System.out.println("Index: "+index+" ||Position: "+(index+1));
    }
}
