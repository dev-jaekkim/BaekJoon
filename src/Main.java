import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int targetNumber = Integer.parseInt(bf.readLine());
        int count = 1;
        int range = 2;
        if (targetNumber == 1) {
            System.out.println("1");
        } else {
            while (range <= targetNumber) {
                range = range + (6*count);
                count++;
            }
            System.out.println(count);
        }
    }
}
