import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        // Creating a 6*6 array with integers
        int dimension = 6;
        Scanner sc = new Scanner(System.in);
        int[][] d = new int[dimension][dimension];
        for (int i = 0 ; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                d[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        List<Integer> sumList = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 1; i < dimension-1; i++) {
            for (int j = 1; j < dimension-1; j++) {
                sum = d[i-1][j-1] + d[i-1][j] + d[i-1][j+1] + d[i][j] + d[i+1][j-1] + d[i+1][j] + d[i+1][j+1];
                sumList.add(sum);
            }
        }
        int maxSum = Collections.max(sumList);
        System.out.print(maxSum);
    }
 }