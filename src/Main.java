import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        int totalBaskets = Integer.parseInt(st.nextToken());
        int totalInput = Integer.parseInt(st.nextToken());

        int[] baskets = new int[totalBaskets];

        for (int i = 0; i < totalBaskets; i++) {
            baskets[i] = i + 1;
        }

        for (int i = 0; i < totalInput; i++) {
            StringTokenizer st2 = new StringTokenizer(bf.readLine());
            int firstBasket = Integer.parseInt(st2.nextToken());
            int lastBasket = Integer.parseInt(st2.nextToken());

            int temp1 = baskets[firstBasket - 1];
            baskets[firstBasket - 1] = baskets[lastBasket - 1];
            baskets[lastBasket - 1] = temp1;
            int remainingCount = lastBasket - firstBasket - 1;

            if (remainingCount > 0) {
                remainingCount = remainingCount / 2;
                firstBasket += 1;
                lastBasket -= 1;

                for (int j = 0; j < remainingCount; j++) {
                    int temp = baskets[firstBasket - 1];
                    baskets[firstBasket - 1] = baskets[lastBasket - 1];
                    baskets[lastBasket - 1] = temp;
                    firstBasket += 1;
                    lastBasket -= 1;
                }

            }
        }

        bf.close();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < totalBaskets; i++) {
            sb.append(baskets[i]);
            sb.append(" ");
        }

        System.out.println(sb);
    }
}
