import java.util.Scanner;

public class Divisible_sum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr = new int[n];
        int k=scan.nextInt();
        int count =0;
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = scan.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if((arr[i]+arr[j])%k==0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
