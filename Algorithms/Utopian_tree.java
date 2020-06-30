import java.util.Scanner;

public class Utopian_tree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t=scan.nextInt();


        for (int i=0; i<t; i++){
            int n=scan.nextInt();
            int height=1;
            int j=0;
            while(j<n){
                if(j%2!=0)
                {
                    height++;
                }
                else
                {
                    height=height*2;
                }
                j++;
            }
            System.out.println(height);
        }

    }
}
