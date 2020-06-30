import java.util.Scanner;

public class Am_Pm {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] parts = s.split(":");
        int hour = Integer.parseInt(parts[0]);
        int min = Integer.parseInt(parts[1]);
        String last = parts[2];
        int seconds = Integer.parseInt(last.substring(0, last.length()/2));
        String ampm = last.substring(last.length()/2, last.length());

        String military = "";

        if(ampm.compareTo("PM")==0)
        {
            military = String.format("%02d:%02d:%02d", (hour+12),min,seconds);
            if(hour == 12)
            {
                military = String.format("%02d:%02d:%02d", (hour),min,seconds);
            }
        }
        if(ampm.compareTo("AM")==0)
        {
            military = String.format("%02d:%02d:%02d", (12-hour),min,seconds);
            if(hour<12)
            {
                military = String.format("%02d:%02d:%02d", (hour),min,seconds);
            }
        }
        System.out.println(military);


    }
}
