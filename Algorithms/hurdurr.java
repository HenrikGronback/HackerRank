import java.util.Scanner;

public class hurdurr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int[] arr=new int[n];
        int highest=0;
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=scan.nextInt();
            highest=Math.max(highest,arr[i]);
        }
        if(k>highest){
            System.out.println(0);
        }
        else {
            System.out.println(highest - k);
        }
    }
}
