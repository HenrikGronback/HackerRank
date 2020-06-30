import java.util.Arrays;
import java.util.Scanner;

public class Angry_professor {
    static String professor(int k, int[] arr){
        int ontimeCount=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=0){
                ontimeCount++;
            }
        }
        if(ontimeCount>=k){
            return "NO";
        }
        else
        {
            return "YES";
        }


    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i = 0; i<n; i++){
            int m=scan.nextInt();
            int k=scan.nextInt();
            int[] arr = new int[m];
            for(int j=0; j<arr.length; j++){
                arr[j]=scan.nextInt();
            }
            System.out.println(professor(k,arr));
        }
    }
}
