import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int arraySize = Integer.parseInt(st.nextToken());
        int totalInput = Integer.parseInt(st.nextToken());

        int[] baskets = new int[arraySize];

        for(int i = 1 ; i <= arraySize; i++) {
            baskets[i-1] = i;
        }

        for(int i = 0 ; i < totalInput ; i++) {
            StringTokenizer st2 = new StringTokenizer(bf.readLine(), " ");
            int switchFirst = Integer.parseInt(st2.nextToken()) - 1;
            int switchLast = Integer.parseInt(st2.nextToken()) - 1;

            int temp = baskets[switchFirst];
            baskets[switchFirst] = baskets[switchLast];
            baskets[switchLast] = temp;
        }

        bf.close();

        StringBuilder sb = new StringBuilder();
        for(int j = 0 ; j < arraySize; j++) {
            sb.append(baskets[j]);
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
