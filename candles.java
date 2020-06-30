import java.util.Arrays;
import java.util.Scanner;

public class candles {
    public static void main(String[] args) {
        int count = 1;
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=scan.nextInt();

        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString((arr)));
        for(int i=1; arr[arr.length-1]==arr[arr.length-1-i]; i++)
        {
            if(arr[0]==arr[arr.length-1])
            {
                count=arr.length;
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
