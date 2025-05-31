package CelloScope;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr= new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        int primarySum = 0;
        for (int i=0; i<n; i++) {
            primarySum+= arr[i][i];
        }
        int secondarySum = 0;
        int j=0;
        for (int i=n-1; i >= 0; i--) {
            secondarySum+= arr[j][i];
            j++;
        }
        int difference = Math.abs(primarySum-secondarySum);
        System.out.println(difference);
    }
}
