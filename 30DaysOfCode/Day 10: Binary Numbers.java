import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int counter=1;
        int currentBest=1;
        String binary=Integer.toBinaryString(n);
        for(int i=0; i<binary.length()-1; i++){
            if(binary.charAt(i)=='1'&& binary.charAt(i+1)=='1'){
                counter++;
                if(counter>=currentBest){
                    currentBest=counter;
                }
            }
            else{
                counter=1;
            }
        }
        System.out.println(currentBest);

    }
}
