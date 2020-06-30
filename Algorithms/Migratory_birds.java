import java.util.Arrays;
import java.util.Scanner;

public class Migratory_birds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int[] countArray=new int[6];
        int max=0;

        for(int i=0; i<arr.length; i++){
            arr[i]=scan.nextInt();
        }

        for(int val:arr)
        {
            countArray[val]++;
            max= Math.max(max,countArray[val]);
        }

        for(int i=0; i<arr.length; i++)
        {

            if(countArray[i]==max)
            {
                System.out.println(i);
            }


        }



    }
}
