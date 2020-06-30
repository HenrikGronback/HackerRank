import java.util.Scanner;

public class Diagonal_difference {
    private static int result(int[][] input, int size)
    {
        int sumLeft=0;
        int sumRight=0;
        for(int i=0; i<size; i++){
            sumLeft+=input[i][i];
            sumRight+=input[size-1-i][i];
        }
        return Math.abs(sumLeft-sumRight);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[][] matrix = new int[size][size];

        for(int i=0; i<size; i++){
            System.out.println(" ");
            for (int j=0; j<size; j++){
                matrix[i][j]=scan.nextInt();
                //System.out.println(matrix[i][j]);
            }
        }
        //System.out.println(matrix[1][1]);
        //scan.close();
        int res=result(matrix,size);
        System.out.println(res);
    }

}
