import java.util.Scanner;

public class Advertising {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int recipents=5;
        int sum=0;
        for (int i = 0; i<n; i++){
            recipents=recipents/2;
            sum+=recipents;
            recipents=recipents*3;
        }
        System.out.println(sum);
    }
}
