import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr=new int[n];
        String s="";

        for(int i = 0; i<arr.length; i++)
        {
            arr[i]=scan.nextInt();
        }
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }




    }
}

