import java.util.ArrayList;
import java.util.Scanner;

public class Plus_minus {

    public static void ratio(int[] arr) {
        int posCount = 0;
        int negCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                posCount++;
            } else if (arr[i] < 0) {
                negCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println(String.valueOf((double)posCount/(double)arr.length));
        System.out.println(String.valueOf((double)negCount/(double)arr.length));
        System.out.println(String.valueOf((double)zeroCount/(double)arr.length));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n=scan.nextInt();
        int[] arr = new int[n];


        for(int i=0; i<arr.length; i++) {
            arr[i]=scan.nextInt();
        }
            ratio(arr);
        }


    }

