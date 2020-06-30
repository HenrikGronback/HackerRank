import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class twod_arraylist {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        List<ArrayList<Integer>> lists = new ArrayList<>();
        for (int row = 0; row < n; row++) {
            int d = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int col = 0; col < d; col++) {
                list.add(scan.nextInt());

            }
            lists.add(list);
            System.out.println(lists.toString());
            //List<List<Integer>> diagonalDifference = new ArrayList<>();
            //diagonalDifference.get(1).add()
            //diagonalDifference.add(44);

            //System.out.println("ArrayList : " + diagonalDifference.toString());
            //System.out.println(diagonalDifference.get(1));
            //System.out.println(diagonalDifference.size());
        }
    }


    }

