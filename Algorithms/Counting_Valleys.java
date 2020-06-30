import java.util.Arrays;
import java.util.Scanner;

public class Counting_Valleys {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        String s=scan.nextLine();
        int[] num = new int[n];
        char[] arr = s.toCharArray();
        int sum=0;
        int valleyCount=0;
        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]=='D')
            {
                num[i]=-1;
            }
            else
            {
                num[i]=1;
            }
        }
        for(int i = 0; i<num.length; i++){
            sum+=num[i];
            if(sum==0 && num[i]==1)
            {
               valleyCount++;
            }
        }
        System.out.println(valleyCount);

    }
}
