package Question.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetMatrixZero {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int rowLength=scanner.nextInt();
        int colLength=scanner.nextInt();


        int[][]arr=new int[rowLength][colLength];

        for(int i=0;i<rowLength;i++) {
            for (int j = 0; j < colLength; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        Set<Integer>row=new HashSet<>();
        Set<Integer>column=new HashSet<>();

        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                if(arr[i][j]==0){
                    row.add(i);
                    column.add(i);
                }
            }
        }

        for(int i=0;i<rowLength;i++) {

            if (row.contains(i)) {
                for (int j = 0; j < colLength; j++) {
                    arr[i][j] = 0;
                }
            } else {

                for (int k = 0; k < colLength; k++) {
                    if(column.contains(k)){
                        arr[i][k]=0;
                    }
                }
            }
        }


        for(int i=0;i<rowLength;i++) {
            for (int j = 0; j < colLength; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}
