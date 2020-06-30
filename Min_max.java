import java.util.Arrays;
import java.util.Scanner;

public class Min_max {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long max_sum=0;
        long min_sum=0;
        int[] arr = new int[5];
        for(int i = 0; i<arr.length; i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i<4; i++)
        {
            min_sum+=arr[i];
        }
        for(int i = 1; i<arr.length; i++){
            max_sum+=arr[i];
        }
        System.out.print(min_sum+" "+max_sum );

    }
}
