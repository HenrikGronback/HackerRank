import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Cat_mouse {
    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0; i<n; i++){
            List<Integer> arr = new ArrayList<>();
            //System.out.println(arr.size());
        for(int j = 0; j<3; j++){
            arr.add(scan.nextInt());
            //System.out.println(j);
        }
        list.add(arr);
        int x = list.get(i).get(0);
        int y = list.get(i).get(1);
        int z = list.get(i).get(2);
            if(Math.abs(x-z)>Math.abs(y-z)){
                System.out.println("Cat B");
            }
            else if(Math.abs(x-z)<Math.abs(y-z)){
                System.out.println("Cat A");
            }
            else{
                System.out.println("Mouse C");
            }

        }
        //System.out.println(Arrays.deepToString(list.toArray()));
        //
        //System.out.println(list.get(1)[2]);
        //System.out.println(list.toString());
/*

        */

        //System.out.println(list.get(1).get(2));


    }
}
