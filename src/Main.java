import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int targetNumber = Integer.parseInt(bf.readLine());
        bf.close();
        int result = 0;

        for (int i = 1; i <= targetNumber; i++) {
            int sum = 0;
            int tempNum = i;
            while (tempNum != 0) {
                sum += tempNum % 10;
                tempNum /= 10;
            }

            if (sum + i == targetNumber) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
