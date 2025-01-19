import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int inputNumCount = Integer.parseInt(bf.readLine());
        int resultCount = 0;

        String numList = bf.readLine();
        bf.close();
        StringTokenizer st = new StringTokenizer(numList, " ");

        for (int i = 0; i < inputNumCount; i++) {
            int areYouPrime = Integer.parseInt(st.nextToken());
            boolean primeCheck = true;
            for (int j = 2; j < areYouPrime; j++) {
                if (areYouPrime % j == 0) {
                    primeCheck = false;
                    break;
                }
            }

            if (primeCheck && areYouPrime != 1) {
                resultCount += 1;
            }
        }

        System.out.println(resultCount);
    }
}
