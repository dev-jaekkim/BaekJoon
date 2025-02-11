import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int totalNumbers = Integer.parseInt(bf.readLine());
        int[] arrayToSort = new int[totalNumbers];
        int[] countingSort = new int[10001];
        int[] result = new int[totalNumbers];

        // 정렬 값 counting 정렬 안에 넣어주기
        for(int i = 0 ; i < totalNumbers; i++) {
            int value = Integer.parseInt(bf.readLine());
            arrayToSort[i] = value;
            countingSort[arrayToSort[i]]++;
        }

        // counting 배열 누적합 구하기
        for(int i = 1; i < countingSort.length; i++) {
            countingSort[i] += countingSort[i-1];
        }

        // 최종 결과값 세팅
        for(int i = result.length - 1 ; i >= 0 ; i--) {
            int value = arrayToSort[i];
            countingSort[value]--;
            result[countingSort[value]] = value;
        }

        StringBuilder resultString = new StringBuilder();
        for(int value : result) {
            resultString.append(value);
            resultString.append(System.lineSeparator());
        }

        System.out.println(resultString);

    }
}
