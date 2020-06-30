import java.util.Arrays;
import java.util.Scanner;

public class grading_students {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int grades[] = new int[n];


        for(int i=0; i<grades.length; i++)
        {
           grades[i]=scan.nextInt();
           int tempGrade=grades[i];
           int count=0;
           while((tempGrade%5)!=0)
           {
               count++;
               tempGrade++;
           }
           if(grades[i]>=38)
           {
               if(count<3)
               {
                   grades[i]=tempGrade;
               }
           }
            System.out.println(grades[i]);
            //System.out.println(tempGrade);
            //System.out.println(count);
            //System.out.println(grades[0]);
        }

        //System.out.println(Arrays.toString(grades));
    }
}
