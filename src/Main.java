import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalNumbers = Integer.parseInt(bf.readLine());
        int[] arrayToSort = new int[totalNumbers];

        for (int i = 0; i < totalNumbers; i++) {
            arrayToSort[i] = Integer.parseInt(bf.readLine());
        }

        // 배열에 다 들어옴
        // 이중 for 문 필요 왜냐면 전부 다 비교해야함.

        for (int i = 0; i < totalNumbers; i++) {
            int temp = arrayToSort[i];
//            System.out.println("temp = " + temp);
            for (int j = 0; j < totalNumbers; j++) {
//                    System.out.println("j 이중 포문 들어옴 arrayToSort[i] = " + arrayToSort[i]);
//                    System.out.println("j 이중 포문 들어옴 arrayToSort[j] = " + arrayToSort[j]);
                if (arrayToSort[i] < arrayToSort[j]) {
                    arrayToSort[i] = arrayToSort[j];
                    arrayToSort[j] = temp;
//                    System.out.println("순서 변환 후 : arrayToSort[i] = " + arrayToSort[i]);
//                    System.out.println("순서 변환 후 : arrayToSort[j] = " + arrayToSort[j]);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int a : arrayToSort) {
            sb.append(a);
            sb.append(System.lineSeparator());
        }
        System.out.println(sb);

    }
}
