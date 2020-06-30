import java.util.ArrayList;
import java.util.Scanner;

public class movies {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a=scan.nextInt();
        int b=scan.nextInt();
        int k=scan.nextInt();
        int count=0;
        ArrayList<Integer> arr=new ArrayList<>();

        while(b>=a){
            arr.add(a);
            a++;
        }
        for(int i = 0; i<arr.size(); i++){

            StringBuilder sb = new StringBuilder(Integer.toString(arr.get(i)));
            int reverse=Integer.parseInt(sb.reverse().toString());
            //System.out.println(reverse);
            if(((arr.get(i)-reverse)%k==0)){
                count++;
            }
            System.out.println(sb.reverse());
        }

        //System.out.println();



    }
}
