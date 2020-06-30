import java.util.Arrays;
import java.util.Scanner;

public class PDF_Viewer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String alpabet="abcdefghijklmnopqrstuvwxyz";
        char[] alpha=alpabet.toCharArray();
        int[] alphanum=new int[26];
        int currentHighest=0;

        for(int i=0; i<alphanum.length; i++){
            alphanum[i]=scan.nextInt();
        }
        //scan.nextLine();
        String s=scan.next();
        char[] arr=s.toCharArray();
        for(int i = 0; i<arr.length; i++){
            for(int j=0; j<alphanum.length; j++){
                if(arr[i]==alpha[j]){
                    if(alphanum[j]>currentHighest)
                        currentHighest=alphanum[j];

                }
            }

        }
        System.out.println(arr.length*currentHighest);
        //System.out.println(Arrays.toString(alpha));
        //System.out.println(Arrays.toString(alphanum));
        //System.out.println(s);
        //System.out.println(alpha[3]);
        //String s="a";
        //System.out.println(Integer.parseUnsignedInt(s));
        //System.out.println(s);
    }
}
