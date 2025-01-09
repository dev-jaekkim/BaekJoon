import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bf.readLine();
        StringTokenizer st = new StringTokenizer(sentence,  " ");
        bf.close();
        int totalWords = 0;
        while(st.hasMoreTokens()) {
            totalWords += 1;
            st.nextToken();
        }

        System.out.println(totalWords);
    }
}
