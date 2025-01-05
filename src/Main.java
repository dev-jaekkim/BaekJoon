import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String totalPriceString = bf.readLine();
        int totalPrice = Integer.parseInt(totalPriceString);

        String boughtCountString = bf.readLine();
        int boughtCount = Integer.parseInt(boughtCountString);

        int calculatedTotalPrice = 0;

        for (int i = 0; i < boughtCount; i++) {
            String priceAndCountString = bf.readLine();
            StringTokenizer st = new StringTokenizer(priceAndCountString, " ");
            int price = Integer.parseInt(st.nextToken());
            int count = Integer.parseInt(st.nextToken());
            calculatedTotalPrice += price * count;
        }

        bf.close();

        String result = "Yes";

        if (totalPrice != calculatedTotalPrice) {
            result = "No";
        }

        System.out.println(result);
    }

}
