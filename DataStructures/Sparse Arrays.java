import java.util.Arrays;
import java.util.Scanner;

public class Sparse_arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        String[] strings=new String[n];
        for(int i = 0; i<strings.length; i++){
            strings[i]=scan.next();

        }
        int m = scan.nextInt();
        String[] queries=new String[m];
        int[] result=new int[m];
        for(int i = 0; i<queries.length; i++){
            queries[i]=scan.next();
        }
        for(int i = 0; i<strings.length; i++){
            for(int j=0; j<queries.length; j++){
                if(strings[i].equals(queries[j])){
                    result[j]++;
                }
            }
        }
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
        //System.out.println(Arrays.toString(result));
        //System.out.println(Arrays.toString(queries));
    }
}


