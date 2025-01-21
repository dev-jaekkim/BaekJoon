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

        double result = Math.pow(Double.parseDouble(st.nextToken()), 2)
                + Math.pow(Double.parseDouble(st.nextToken()), 2)
                + Math.pow(Double.parseDouble(st.nextToken()), 2)
                + Math.pow(Double.parseDouble(st.nextToken()), 2)
                + Math.pow(Double.parseDouble(st.nextToken()), 2);

        System.out.printf("%d",(int)result%10);
    }
}
