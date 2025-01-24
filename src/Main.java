import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputLine = bf.readLine();
        bf.close();

        StringTokenizer st = new StringTokenizer(inputLine, " ");

        int firstNumber = Integer.parseInt(st.nextToken());
        int countNumber = firstNumber;

        for (int i = 0; i < 7; i++) {

            if (firstNumber == 1 && i == 0) {
                countNumber++;
            }

            if (firstNumber == 8 && i == 0) {
                countNumber--;
            }

            int nextNumber = Integer.parseInt(st.nextToken());

            if (nextNumber == countNumber) {
                if (firstNumber == 1) {
                    countNumber++;
                }

                if (firstNumber == 8) {
                    countNumber--;
                }
            } else {
                System.out.println("mixed");
                break;
            }
        }

        if (countNumber == 9) {
            System.out.println("ascending");
        }

        if (countNumber == 0) {
            System.out.println("descending");
        }
    }
}
