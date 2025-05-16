package BinarySearch;

import java.util.Scanner;

public class CountRotation {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        int count=1;
        for(int i=0;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                count++;
            }
            else{
                break;
            }
        }

        if(count==n){
            count=0;
        }
        System.out.println("Number of rotations: "+count);



    }
}
