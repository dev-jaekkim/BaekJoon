import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalInputs = Integer.parseInt(bf.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0 ; i <totalInputs ; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int repeatCount = Integer.parseInt(st.nextToken());
            String letters = st.nextToken();
            for(int k = 0 ; k < letters.length(); k++) {
                for(int j = 0 ; j < repeatCount ; j++) {
                    sb.append(letters.charAt(k));
                }
            }
            sb.append(System.lineSeparator());
        }
        bf.close();
        System.out.println(sb);
    }
}
