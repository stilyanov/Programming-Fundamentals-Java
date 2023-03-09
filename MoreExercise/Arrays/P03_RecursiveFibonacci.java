package Arrays_MoreExercise;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03_RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = Integer.parseInt(scanner.nextLine());

        int[] fibonacciArr = new int[number];

        fibonacciArr[0] = 1;
        for (int i = 2; i < fibonacciArr.length; i++) {
            fibonacciArr[1] = 1;
            fibonacciArr[i] = fibonacciArr[i-1] + fibonacciArr[i-2];
        }
        System.out.println(fibonacciArr[fibonacciArr.length - 1]);

    }
}
