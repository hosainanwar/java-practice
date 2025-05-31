package CelloScope;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long minimumSum = 0;
        for(int i=0; i<n-1; i++) {
            minimumSum += arr[i];
        }
        long maxSum = 0;
        for(int i=1; i<n; i++) {
            maxSum += arr[i];
        }
        System.out.println(minimumSum + " " + maxSum);
    }

}
