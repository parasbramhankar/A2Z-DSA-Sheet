package Question.Array;

import java.util.Arrays;
import java.util.Scanner;

public class RotateMatrixBy90 {

    public static void rotate(int [][]matrix, int row){
        int start=0;
        int end=matrix.length-1;

        while(start<end){
            int temp=matrix[row][start];
            matrix[row][start]=matrix[row][end];
            matrix[row][end]=temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[][] matrix) {

        int n=matrix.length;

        for(int i=0;i<n;i++){

            for(int j=i;j<n;j++){

                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;

            }
        }

        for(int i=0;i<n;i++){
            rotate(matrix,i);
        }

    }



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n= scanner.nextInt();


        int[][]arr=new int[n][n];

        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        rotate(arr);

        for(int i=0;i<n;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
