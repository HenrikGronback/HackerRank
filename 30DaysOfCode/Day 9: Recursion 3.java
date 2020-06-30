import java.util.Scanner;
public class recursion {

    static int factorial(int n){
        if(n<=1){
            return 1;
        }
        else{
            int i=n*factorial(n-1);
            return i;
        }
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(factorial(n));


    }
}
