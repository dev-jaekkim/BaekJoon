import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalNumCount = Integer.parseInt(bf.readLine());
        int primeNumResult = 0;

        String numberLine = bf.readLine();
        bf.close();
        StringTokenizer st = new StringTokenizer(numberLine, " ");

        for (int i = 0; i < totalNumCount; i++) {
            int areYouPrime = Integer.parseInt(st.nextToken());
            boolean primeCheck = true;
            if(areYouPrime==1){
                continue;
            }

            for(int j = 2 ; j <= Math.sqrt(areYouPrime); j++) {

                if(areYouPrime%j ==0) {
                    primeCheck = false;
                    break;
                }
            }

            if(primeCheck) {
                primeNumResult += 1;
            }
        }

        System.out.println(primeNumResult);
    }
}
