import java.util.ArrayList;
import java.util.Scanner;

public class prisoneer {
    static int solve(int numPrisoneers, int numSweets, int startSeet) {
        ArrayList<Integer> arr = new ArrayList<>();
        int a = startSeet;
        boolean flag = true;
        while (arr.size()<=numSweets) {
            while (a <= numSweets) {
                arr.add(a);
                if (a > numPrisoneers) {
                    a = startSeet;
                }
                a++;
            }


            if(numSweets<=arr.size()){
                flag=false;
            }

        }

        return (arr.get(numSweets)-startSeet);
    }

    static int saveThePrisoner(int n, int m, int s) {
        int r = m % n;
        if ((r + s - 1) % n == 0) {
            return n;
        } else {
            return ((r + s - 1) % n);
        }

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0; i<n; i++){
            int numPrisoneers=scan.nextInt();
            int numSweets=scan.nextInt();
            int startSeet=scan.nextInt();
            System.out.println(saveThePrisoner(numPrisoneers,numSweets,startSeet));


        }
    }
}
