import java.util.Scanner;

public class Drawing_book {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int p=scan.nextInt();
        int slides=(n)/2;
        //System.out.println(slides);
        int pagesRight= slides-(p/2);
        int pagesleft = p/2;
        if(pagesleft<pagesRight){
            System.out.println(pagesleft);
        }
        else{
            System.out.println(pagesRight);
        }
    }
}
