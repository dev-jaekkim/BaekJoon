import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String resultValue = Integer.toString(Integer.parseInt(bf.readLine())*Integer.parseInt(bf.readLine())*Integer.parseInt(bf.readLine()));
        bf.close();

        int [] valueCount = new int[10];

        for(int i = 0 ; i < resultValue.length(); i++) {
            int c = resultValue.charAt(i) - '0';
            valueCount[c] += 1;
        }

        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(valueCount[i]);
        }
    }
}
