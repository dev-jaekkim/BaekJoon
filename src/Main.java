import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int lastNumber = Integer.parseInt(bf.readLine());
        bf.close();

        for (int i = 1; i <= lastNumber; i++) {
            System.out.println(i);
        }
    }
}
