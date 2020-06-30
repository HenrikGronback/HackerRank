import java.util.Arrays;
import java.util.Scanner;

public class Sock_Merchant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        int pair = 0;
        for(int i = 0; i<arr.length; i++)
        {
            arr[i]=scan.nextInt();

        }
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1; i++) {
            if (arr[i] == arr[i + 1]) {
                pair++;
                //if(i<arr.length-) {
                    i++;
                //}
            }
        }
        System.out.println(pair);
    }
}
