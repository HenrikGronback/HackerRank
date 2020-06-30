import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []arg){
       Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int new_sum=a;
            for(int l=0;l<n; l++){
                int sum=(int)(Math.pow(2,l)*b);
                new_sum=new_sum+sum;
                System.out.print(new_sum+" ");
            }
            System.out.println("");
        }
        in.close();
    }
}
