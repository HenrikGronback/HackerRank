import java.util.Scanner;

public class Electronics_Shop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int b = scan.nextInt();
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] keyboards = new int[n];
        int[] drives = new int[m];
        int sum = 0;
        int currentHighest=0;
        for(int i = 0; i<keyboards.length; i++){
            keyboards[i]=scan.nextInt();
        }
        for(int i = 0; i<drives.length; i++){
            drives[i]=scan.nextInt();
        }
        for(int i =0; i<keyboards.length; i++){
            sum=0;
            for(int j = 0; j<drives.length; j++){
                sum=keyboards[i]+drives[j];
                if(sum<=b && sum>currentHighest){
                    currentHighest=sum;
                }

            }
        }
        if(currentHighest==0){
            System.out.println("-1");
        }
        else {
            System.out.println(currentHighest);
        }
    }
}
