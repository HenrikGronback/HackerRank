
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
    public class Lets_review {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            //char[] arr2 = scan.next().toCharArray();
            for(int i = 0; i<n; i++){
                char[] arr = scan.next().toCharArray();
                String even="";
                String odd="";
                for(int j=0; j<arr.length; j++){
                    if(j%2==0){
                        even+=arr[j];

                    }
                    else{
                        odd+=arr[j];
                    }
                }
                System.out.println(even+" "+ odd);

            }
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        }
    }

