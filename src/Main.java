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

        int NumberToSolve = Integer.parseInt(st.nextToken());
        int formation = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while(NumberToSolve >= formation) {

            char c = 'a';

            if(NumberToSolve % formation >= 10 ) {
                c = (char) ((NumberToSolve % formation) + 55);
            } else {
                c = (char) ((NumberToSolve % formation) + 48);
            }

            NumberToSolve = NumberToSolve / formation;
            sb.insert(0, c);
        }

        if(NumberToSolve >= 10 ) {
            sb.insert(0,(char) ((NumberToSolve + 55)));
        } else {
            sb.insert(0,(char) ((NumberToSolve + 48)));
        }

        System.out.println(sb);
    }
}
