import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hej {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        //int k=0;
        //int sum = 0;
        int currentBest=-1000;
        int numberOfColumns = arr.length;
        int numberOfRows = arr[1].length;
        //arr[i][]
        for (int i = 0; i < numberOfRows - 2; i++) {
            for (int j = 0; j < numberOfColumns - 2; j++) {
                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i + 1][j + 1] + arr[i+2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (sum > currentBest)
                    currentBest = sum;
            }
        }
        System.out.print(currentBest);
        //System.out.print("Nr of col " + numberOfColumns);
        //System.out.print("Nr of rows" + numberOfRows);


        scanner.close();
    }
}
