import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        char[] original= A.toCharArray();

        char[] Backward = new char[A.length()];
        int j=0;
        //System.out.println(original.);
        //System.out.println(Backward.length());

        for(int i=A.length()-1; i>=0; i--)
        {
            Backward[i]=original[j];
            //System.out.println(Backward[i]);
            //System.out.println(original[j]);

            j++;
        }
        System.out.println("backwards: " + String.valueOf(Backward));
        System.out.println("original: " + String.valueOf(original));
        System.out.println(original.length);
        System.out.println(Backward.length);
        System.out.println(A.length());
        if(Arrays.equals(Backward,original))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
