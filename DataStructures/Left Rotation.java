import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class leftRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int numRot= scan.nextInt();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            al.add(scan.nextInt());
        }
        for(int i=0; i<numRot; i++){
            int firstElement=al.get(0);
            al.remove(0);
            al.add(firstElement);

        }
        for(int i = 0; i<al.size(); i++){
            System.out.print(al.get(i)+" ");
        }

    }
}
