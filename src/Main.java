import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        bf.close();
        StringTokenizer st = new StringTokenizer(input, " ");
        String number = st.nextToken();
        int formationNum = Integer.parseInt(st.nextToken());
        int finalValue = 0;
        int temp = 1;

        for (int i = number.length() - 1; i >= 0; i--) {
            char c = number.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                finalValue += (c-55) * temp;
            } else {
                finalValue += (c-48) * temp;
            }

            temp *= formationNum;
        }

        System.out.print(finalValue);
    }
}
