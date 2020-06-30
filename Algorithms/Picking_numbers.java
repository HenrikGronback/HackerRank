import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Picking_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr=new int[n];
        int count=0;
        ArrayList<Integer> uniques=new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        uniques.add(arr[0]);
        for(int i = 0; i<arr.length-1; i++)
        {
            if(arr[i]!=arr[i+1]){
                uniques.add(arr[i+1]);
            }
            /*if()
            for(int j = 0; j<arr.length; j++) {
                if (j != i) {
                    if (Math.abs(arr[i] - arr[j]) <= 1) {
                        count++;
                    }
                }
            }*/
        }
        System.out.println(uniques.toString());

    }
}
