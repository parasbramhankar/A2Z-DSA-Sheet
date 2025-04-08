package Question.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            // Top row
            for (int i = left; i <= right; i++) {
                res.add(matrix[top][i]);
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                res.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                // Bottom row
                for (int i = right; i >= left; i--) {
                    res.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // Left column
                for (int i = bottom; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int rowLength=scanner.nextInt();
        int colLength=scanner.nextInt();


        int[][]arr=new int[rowLength][rowLength];

        for(int i=0;i<rowLength;i++) {
            for (int j = 0; j < rowLength; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        List<Integer>list=spiralOrder(arr);

        System.out.println(list);



    }
}
