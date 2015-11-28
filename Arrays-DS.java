import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            stack.push(i);
        }
        for (int i : arr) {
            System.out.print(stack.pop());
            System.out.print(' ');
        }
    }
}