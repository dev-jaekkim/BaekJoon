import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalCase = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i< totalCase ; i++) {
            String nextWord = bf.readLine();
            sb.append(nextWord.charAt(0));
            sb.append(nextWord.charAt(nextWord.length() - 1));
            sb.append(System.lineSeparator());
        }

        bf.close();
        System.out.println(sb);
    }
}
