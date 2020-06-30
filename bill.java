import java.util.Scanner;

public class bill {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        int index = scan.nextInt();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            if (i != index) {
                sum += arr[i];
            }

        }
        int charged = scan.nextInt();

        int sumActual = sum / 2;
        if ((charged - sumActual) == 0) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(charged - sumActual);
        }
    }
}
