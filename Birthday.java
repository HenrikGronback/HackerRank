import java.util.Arrays;
import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr= new int[n];
        int count=0;
        for (int i = 0; i<arr.length; i++)
        {
            arr[i]=scan.nextInt();
        }
        int day=scan.nextInt();
        int month=scan.nextInt();
        //System.out.println(day+" "+month);
        //System.out.println(Arrays.toString(arr));
        for(int i = 0; i<arr.length-month+1; i++) {
            int sum=0;
            for (int j = i; j < i+month; j++) {
            sum+=arr[j];

            }
            if(sum==day)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
