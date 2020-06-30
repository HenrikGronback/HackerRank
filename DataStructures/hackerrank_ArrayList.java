import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.concurrent.ExecutionException;
import java.util.regex.*;
public class hackerrank_ArrayList {


    public static void main(String[] args) {
        ArrayList<Integer[]> list = new ArrayList<>();
        ArrayList<Integer[]> quieriesList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {

            Integer[] line = new Integer[scan.nextInt()];

            for (int j = 0; j < line.length; j++)
            {
                line[j] = scan.nextInt();
            }
            list.add(line);
        }
        int m=scan.nextInt();
        for(int i=0; i<m; i++)
        {
            Integer[] point = new Integer[2];
            for(int j=0; j<point.length; j++)
            {
                point[j]=scan.nextInt();
            }
            quieriesList.add(point);
        }

        for(int i=0; i<quieriesList.size(); i++)
        {
            try {
                int temp1 = quieriesList.get(i)[0] - 1;
                int temp2 = quieriesList.get(i)[1] - 1;
                System.out.println(String.valueOf(list.get(temp1)[temp2]));
            }
            catch(Exception e){
            System.out.println("ERROR!");
            }
        }

        //list.get(1);
        //System.out.println(quieriesList.size());

    }
}

