import java.util.Scanner;

public class Breaking_records {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int highestCount=0;
        int lowestCount=0;
        int[] scores = new int[n];
        for(int i=0; i<scores.length; i++)
        {
            scores[i]=scan.nextInt();
        }
        int highestScore=scores[0];
        int lowestScore=scores[0];
        for(int i=1; i<scores.length; i++)
        {
            if(scores[i]>highestScore)
            {
                highestCount++;
                highestScore=scores[i];
            }
            else if(scores[i]<lowestScore){
                lowestCount++;
                lowestScore=scores[i];
            }
        }
        System.out.println(highestCount+ " "+ lowestCount);
    }
}
