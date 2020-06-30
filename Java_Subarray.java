import java.util.Scanner;

public class Java_Subarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scan.nextInt();
            System.out.println(array[i]);
        }
        //scan.close();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = i; j < array.length; j++) {
                sum += array[j];
                if (sum < 0) {
                    count++;
                }
            }

        }
        System.out.println(count);
    }
}
