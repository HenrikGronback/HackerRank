import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class compare_triplets {


        // Complete the compareTriplets function below.
        static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
            ArrayList<Integer> list = new ArrayList<>();
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < 3; i++) {
                if (a.get(i) > b.get(i)) {
                    sum1++;
                }
                if (a.get(i) < b.get(i)) {
                    sum2++;

                }


            }
            list.add(sum1);
            list.add(sum2);

            return list;
            
        }

        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] aItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> a = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a.add(aItem);
            }

            String[] bItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> b = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                int bItem = Integer.parseInt(bItems[i]);
                b.add(bItem);
            }

            List<Integer> result = compareTriplets(a, b);

            for (int i = 0; i < result.size(); i++) {
                bufferedWriter.write(String.valueOf(result.get(i)));

                if (i != result.size() - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

