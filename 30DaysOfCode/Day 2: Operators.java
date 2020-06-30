import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the solve function below.
    static void solve(double mealCost, int tipPercent, int taxPercent) {
        /*int total_cost = (int)Math.round(meal_cost+(meal_cost*(tip_percent/100))+(meal_cost*(tax_percent/100)));
        double tip=(double)(meal_cost*(tip_percent/100));
        double tax=(double)(meal_cost*(tax_percent/100));

        
        */
        int totalCost = (int) Math.round(mealCost + 
                                         mealCost * tipPercent / 100.0 + 
                                         mealCost * taxPercent / 100.0);

System.out.println(totalCost);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}